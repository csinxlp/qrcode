package com.qrcode.utils;

import com.gson.utils.GsonUtils;
import com.qrcode.model.CashierTransRequest;

/**
 * 利用Google的ZXing工具包，生成和解析二维码图片
 * <p>
 * Created by Eric on 2017/2/15.
 */
public class QRCodeEvents {

	public static void main(String[] args) {
		
		CashierTransRequest cashierTransRequest = new CashierTransRequest();
		cashierTransRequest.setAppId("20161228qXmovybo");
		cashierTransRequest.setServiceId("xxxx");
		cashierTransRequest.setFormat("FORM");
		cashierTransRequest.setCharset("UTF-8");
		cashierTransRequest.setSignType("signType");
		cashierTransRequest.setSign("test");
		cashierTransRequest.setVersion("1");
		cashierTransRequest.setCardType("03");
		cashierTransRequest.setNotifyUrl("https://www.baidu.com");
		cashierTransRequest.setTermId("1");
		StringBuffer buffer =new StringBuffer(100); 
		buffer.append(GsonUtils.tojson(cashierTransRequest));
		String url ="xxxxxxx"
				+"tntInstId=1000223"
				+"&merchantCode=TEST01"
				+"&appId=20161228qXmovybo"
				+"&serviceId=www.baidu.com"
				+"&format=FORM"
				+"&charset=UTF-8"
				+"&signType=signType"
				+"&sign=test"
				+"&version=1"
				+"&termId=1"
				+"&notifyUrl=https://www.baidu.com";
		
		
		
		
		System.out.println("二维码内容 " + url);
		int width = 300; // 二维码图片的宽
		int height = 300; // 二维码图片的高
		String format = "png"; // 二维码图片的格式

		try {
			// 生成二维码图片，并返回图片路径
			String pathName = QRCodeUtils.generateQRCode(url, width, height,
					format);
			System.out.println("生成二维码的图片路径： " + pathName);
			String content = QRCodeUtils.parseQRCode(pathName);
			System.out.println("解析出二维码的图片的内容为： " + content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
