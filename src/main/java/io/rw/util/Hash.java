package io.rw.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    private String input;

    public Hash(String input) {
        this.input = input;
    }

    public String sha512(){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            byte[] result = digest.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b: result) {
                sb.append(String.format("%-2s",Integer.toHexString(0xFF & b)).replace(' ', '0'));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex){
            return "";
        }
    }

}
