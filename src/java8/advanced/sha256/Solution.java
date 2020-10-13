package java8.advanced.sha256;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

        sha256.update(password.getBytes());
        byte[] digest = sha256.digest();

        for (byte b : digest) {
            System.out.printf("%02x", b);
        }

        scanner.close();
    }

}
