package caso9;


import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Idea {
	public static byte[] encrypt(String toEncrypt, String key) throws Exception {
	      // create a binary key from the argument key (seed)
	      SecureRandom sr = new SecureRandom(key.getBytes());
	      KeyGenerator kg = KeyGenerator.getInstance("IDEA");
	      kg.init(sr);
	      SecretKey sk = kg.generateKey();
	  
	      // create an instance of cipher
	      Cipher cipher = Cipher.getInstance("IDEA");
	  
	      // initialize the cipher with the key
	      cipher.init(Cipher.ENCRYPT_MODE, sk);
	  
	      // encrypt
	      byte[] encrypted = cipher.doFinal(toEncrypt.getBytes());
	  
	      return encrypted;
	   }
	  
	   public static String decrypt(byte[] toDecrypt, String key) throws Exception {
	      // create a binary key from the argument key (seed)
	      SecureRandom sr = new SecureRandom(key.getBytes());
	      KeyGenerator kg = KeyGenerator.getInstance("IDEA");
	      kg.init(sr);
	      SecretKey sk = kg.generateKey();
	  
	      // do the decryption with that key
	      Cipher cipher = Cipher.getInstance("IDEA");
	      cipher.init(Cipher.DECRYPT_MODE, sk);
	      byte[] decrypted = cipher.doFinal(toDecrypt);
	  
	      return new String(decrypted);
	   }
}
