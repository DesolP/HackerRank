import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.*;
import java.util.Scanner;

public class MD5 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String text = sc.nextLine();
        byte[] byteText = text.getBytes();
        String resultText = "";
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] result = md.digest(byteText);
            BigInteger no = new BigInteger(1, result);

            // Convert message digest into hex value
            resultText = no.toString(16);
            for (byte b : result) {
                System.out.format("%02x", b);
            }

        }catch(NoSuchAlgorithmException e){
            System.out.println(e);
        }
        System.out.println(resultText);


    }
}
