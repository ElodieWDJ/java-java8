package java8.ex01;

import org.apache.commons.codec.digest.DigestUtils;

public class TestDigestUtils {

	public static void main(String[] args) {
		String Password = "coucou1&";
		String encodePassword = DigestUtils.sha512Hex(Password);

		Password = "coucou2&";
		System.out.println(DigestUtils.sha512Hex(Password));
	}

}
