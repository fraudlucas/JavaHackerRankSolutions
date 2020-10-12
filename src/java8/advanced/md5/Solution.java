package java8.advanced.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        MessageDigest md5 = MessageDigest.getInstance("MD5");

        md5.update(password.getBytes());
        byte[] digest = md5.digest();

        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}
