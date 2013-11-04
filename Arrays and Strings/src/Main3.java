import java.util.Scanner;


public class Main3 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		if (isPermutation(str1, str2)) {
			System.out.println("It is a permutation");
		} else {
			System.out.println("@@It is not a permutation");
		}
	}
	
	/*
	 * -> charSet: index is the ASCII value of the char and the value is the count
	 */
	private static boolean isPermutation(String str1, String str2) {
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		int[] charSet = new int[256];
		
		char[] chrStr1 = str1.toCharArray();
		for (char chr : chrStr1) {
			charSet[chr]++;
		}
		
		char[] chrStr2 = str2.toCharArray();
		for (char chr : chrStr2) {
			charSet[chr]--;
		}
		
		for (int i : charSet) {
			if (i != 0) {
				return false;
			}
		}
		
		return true;
	}

}
