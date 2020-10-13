package com.ajay.qrcode_generator.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.imageio.ImageIO;

import com.ajay.qrcode_generator.model.PaytmDetails;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * QRCodeGeneratorUtil class
 * 
 * @author ajay
 *
 */
public class QRCodeGeneratorUtil {

	/**
	 * QRCODE_PATH
	 */
	public static String QRCODE_PATH = "C:\\Users\\ajay\\Downloads\\Videos\\Youtube\\Java Tools from Java Techie\\QRCode_Server\\";

	/**
	 * To generate QR code on the (path) location.
	 * 
	 * @param paytmDetails
	 * @return message
	 * @throws Exception
	 */
	public String writeQrCode(PaytmDetails paytmDetails) throws Exception {

		String qrcode = QRCODE_PATH + paytmDetails.getUserName() + "-QRCODE.png";

		QRCodeWriter codeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = codeWriter.encode(
				paytmDetails.getUserName() + "\n" + paytmDetails.getMobileNumber() + "\n"
						+ paytmDetails.getAccountType() + "\n" + paytmDetails.getAccountNumber(),
				BarcodeFormat.QR_CODE, 350, 350);

		Path path = FileSystems.getDefault().getPath(qrcode);

		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);

		return "QR code generated successfully.";
	}

	/**
	 * To Read QR code by using its location
	 * 
	 * @param qrCodeImage
	 * @return result text
	 * @throws Exception
	 */
	public String readQrCode(String qrCodeImage) throws Exception {

		BufferedImage bufferedImage = ImageIO.read(new File(qrCodeImage));

		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);

		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));

		Result result = new MultiFormatReader().decode(binaryBitmap);

		return result.getText();
	}
}
