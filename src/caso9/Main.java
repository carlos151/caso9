package caso9;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Main {
	public static void main(String[] args) throws IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, BadPaddingException {
		/*//RSA
        try {
        	RSAKeyPairGenerator keygen = new RSAKeyPairGenerator();
            String encryptedString = Base64.getEncoder().encodeToString(RSAUtil.encrypt("hello world!", keygen.getPublicKey()));
            System.out.println(encryptedString);
            String decryptedString = RSAUtil.decrypt(encryptedString, keygen.getPrivateKey());
            System.out.println(decryptedString);
        } catch (NoSuchAlgorithmException e) {
            System.err.println(e.getMessage());
        }*/

        //IDEA
        String toEncrypt = "hello world!";
        try {
			byte[] encrypted = Idea.encrypt(toEncrypt, "carlos");
			String decrypted = Idea.decrypt(encrypted, "carlos");
			System.out.println("Decrypted text: " + decrypted);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
