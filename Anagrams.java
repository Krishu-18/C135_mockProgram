package mockinterviewquestion;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		System.out.println(areAnagrams(str1, str2));
	}

	public static boolean areAnagrams(String str1, String str2) {
		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}
}
