package hash;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

public class HashFunction {
    public static String getHash(byte[] inputBytes, String algorithm){
    String hashvalue = "";
    try{
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(inputBytes);
        byte[] digestBytes = messageDigest.digest();
        hashvalue = DatatypeConverter.printHexBinary(digestBytes).toLowerCase();
    }catch (Exception e){

    }
    return hashvalue;
    }

    public static void main(String[] args){
        String string = "password";
        String message = getHash(string.getBytes(),"SHA-1");
        System.out.println(message);
    }
}
