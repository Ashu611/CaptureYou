import java.security.MessageDigest;
import java.util.Scanner;

public class hashgenerator{

public static void main(String args[]) throws Exception {
	System.out.println("Enter the word to get the hash value of ");
	Scanner psswrd = new Scanner(System.in);
	String psswrdvalue = psswrd.nextLine();
	
	MessageDigest md = MessageDigest.getInstance("MD5");
	md.update(psswrdvalue.getBytes());
	byte[] z = md.digest();
	StringBuilder sb = new StringBuilder();
	for (byte z1 : z) {
		sb.append(Integer.toHexString(z1 & 0xff));
	}
	String pass = sb.toString();
	
	System.out.println(pass);
	
} 
}
