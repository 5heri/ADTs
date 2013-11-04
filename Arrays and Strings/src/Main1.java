import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		if (isUniqueChar1(input) == false) {
			System.out.println("Not Unique");
		} else {
			System.out.println("Unique");
		}
		
		if (isUniqueChar2(input) == false) {
			System.out.println("Not Unique");
		} else {
			System.out.println("Unique");
		}

	}

	/*
	 * This method uses a set. First the set if filled with the characters of the string 
	 * and then they removed. If a char is no longer in the set it means that the remaining 
	 * char is a duplicate therefore not unique.
	 */
	private static boolean isUniqueChar1(String string) {
		Set<Character> allCharsFromString = new HashSet<Character>();
		for (char chr : string.toCharArray()) {
			allCharsFromString.add(chr);
		}
		
		for (int i = 0; i < string.length(); i++) {
			if (allCharsFromString.contains(string.charAt(i))) {
				allCharsFromString.remove(string.charAt(i));
			} else {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * This method replaces the false with a true in a boolean array at 
	 * the index equal to the ascii value. Before doing that it checks 
	 * if there is already a true boolean value present at that index, if
	 * it is then you know that there is a duplicate and return false.
	 */
	private static boolean isUniqueChar2(String string) {
		boolean[] charSet = new boolean[256];
		
		for (int i = 0; i < string.length(); i ++) {
			int asciiValue = string.charAt(i);
			if (charSet[asciiValue]) {
				return false;
			}
			charSet[asciiValue] = true;
		}
		return true;
	}
}
