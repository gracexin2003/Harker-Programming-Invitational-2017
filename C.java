import java.io.*;
import java.util.*;

public class C {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if (palindrome(s)) System.out.println("yes");
		else System.out.println("no");
		
	}
	
	public static boolean palindrome(String s) {
		s = palindromeHelper(s);
		if (s.length() <= 1) return true;
		else return ((s.charAt(0) == s.charAt(s.length() - 1)) && palindrome(s.substring(1, s.length() - 1)));
	}
	
	private static String palindromeHelper(String s) {
		s = s.toLowerCase();
		if (s.length() == 0) return "";
		// if the character is not a letter
		else if (s.charAt(0) < 'A' || s.charAt(0) > 'z' || (s.charAt(0) > 'Z' && s.charAt(0) < 'a')) {
			return palindromeHelper(s.substring(1));
		} else return s.charAt(0) + palindromeHelper(s.substring(1));
	}

}
