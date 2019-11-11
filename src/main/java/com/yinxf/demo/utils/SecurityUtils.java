package com.yinxf.demo.utils;


import com.creditease.ns.security.dbsec.YXSecurity;

/**
 * @描述：安全工具类
 * @author jiangqiao
 *
 */
public class SecurityUtils {
	/**
	 * @描述：解密工具方法
	 * @param decryptMsg
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String decryptMsg){
		if((decryptMsg == null) || "".equals(decryptMsg)){
			return decryptMsg;
		}
		try {
			YXSecurity yxSecurity = new YXSecurity();
			return yxSecurity.dec_3des_hex(decryptMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptMsg;
	}

	/**
	 * @描述：加密工具方法
	 * @return
	 * @throws Exception
	 */
//	public static String encrypt(String encryptMsg){
//		if((encryptMsg == null) || "".equals(encryptMsg)){
//			return encryptMsg;
//		}
//		YXSecurity yxSecurity = new YXSecurity();
//		try {
//			return yxSecurity.enc_3des_hex(encryptMsg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return encryptMsg;
//	}
//
//	public static void main(String[] args) {
//		//System.out.println(SecurityUtils.decrypt("d8cfa8d4d10b1a5b7e7e34e621b15471"));
//		String str = "13083832873";
//		String name = "df21c15dd204df00907e0909c345b088";
//		String enStr = SecurityUtils.encrypt(str);
//		System.out.println(enStr);
//		System.out.println(SecurityUtils.decrypt(enStr));
//		System.out.println(SecurityUtils.decrypt(name));
//	}
}
