package leet_code_easy.strings;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Selenium";
		char[] rev = new char[s.length()];
		
		for(int i=s.length()-1,j=0; i>=0;i--, j++) {
//			rev[s.length()-i-1] = s.charAt(i);
			rev[j] = s.charAt(i);
		}
		
		String s1 = new String(rev); // 1st way to convert char array into String
		System.out.println(s1);
		
		// To convert any String into Char Array
//		String s2= "Java";
//		char[] ch1 = s2.toCharArray();
//		System.out.println(ch1);

	}

}
