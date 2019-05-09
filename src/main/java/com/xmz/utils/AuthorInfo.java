package com.xmz.utils;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @Author liyuefan
 * @Date ${Date}
 * Description
 */
public class AuthorInfo  extends Authenticator {

        public static String USERNAME = "liyuefan0214@163.com";
        public static String PASSWORD = "aptx4869";

        public AuthorInfo() {
        }

        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(USERNAME, PASSWORD);
        }

}
