import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next().toString();
		System.out.println(compress(input));

	}
	
	private static String compress(String str) {
		StringBuffer strBuffer = new StringBuffer();
		int count = 1;
		char startingChar;
		
		for (int i = 0; i < str.length(); i++) {
			startingChar = str.charAt(i);
			
			if (i + 1 == str.length()) {
				strBuffer.append(startingChar);
				strBuffer.append(count);
				break;
			} else if (startingChar == str.charAt(i + 1)) {
				count++;
			} else {
				strBuffer.append(startingChar);
				strBuffer.append(count);
				startingChar = str.charAt(i + 1);
				count = 1;
			}
		}
		return strBuffer.toString();
	}
}
