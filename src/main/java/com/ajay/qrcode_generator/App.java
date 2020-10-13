package com.ajay.qrcode_generator;

import com.ajay.qrcode_generator.util.QRCodeGeneratorUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("QR code initialize.....");
		QRCodeGeneratorUtil codeGenerator = new QRCodeGeneratorUtil();

		/*
		 * System.out.println( codeGenerator.writeQrCode(new PaytmDetails("AjayCheke96",
		 * 8999348761l, "SAVING", "patym1234567890")));
		 */

		System.out.println(codeGenerator.readQrCode(QRCodeGeneratorUtil.QRCODE_PATH + "AjayCheke96-QRCODE.png"));
	}
}
