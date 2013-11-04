public class Main4 {
	
	public static void main(String[] args) {
		
		char[] charArray = "Mr John Smith".toCharArray();

		System.out.println(charArray);
		
		System.out.println(replaceSpaces(charArray, 17));
	}
	
	private static char[] replaceSpaces(char[] string, int length) {
		char[] realString = new char[length];
		
		for (int i = 0; i < length; i++) {
			realString[i] = ' ';

		}
		
		for (int i = 0; i < string.length; i++) {
			realString[i] = string[i];
		}
		
		for (int i = 0; i < realString.length; i++) {
			if (realString[i] == ' ') {
				shift(realString, i);
				shift(realString, i);
				i = i + 2;
			}
		}
		
		for (int i = 1; i < realString.length; i++) {
			if (realString[i - 1] == ' ' && realString[i] == ' ' 
					&& realString[i + 1] == ' ') {
				realString[i - 1] = '%'; 
				realString[i] = '2' ;
				realString[i + 1] = '0';
			}
		}
		
		char[] out = realString;
		return out;	
	}
	
	private static void shift(char[] string, int startingIndex) {
		for( int index = string.length-2; index >= startingIndex ; index-- ) {
            string[index+1] = string[index];
		
			if (index == startingIndex) {
				string[startingIndex] = ' ';
			}
		}	
	}
}
