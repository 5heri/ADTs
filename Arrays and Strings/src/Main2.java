import java.util.Scanner;


public class Main2 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		System.out.println(reverse(input));

	}
	
	private static String reverse(String string) {
		int requiredLength = string.length() / 2;
		for (int i = 0; i < requiredLength; i++) {
			string = swapAtIndex(i, string.length() - i - 1, string);
		}
		return string;
	}

	private static String swapAtIndex(int index1, int index2, String string) {
		StringBuilder sb = new StringBuilder(string);
		char tmp = sb.charAt(index1);
		sb.setCharAt(index1, string.charAt(index2));
		sb.setCharAt(index2, tmp);
		return sb.toString();
	}
}
