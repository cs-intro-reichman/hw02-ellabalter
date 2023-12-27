/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		String s = args[0];
		int length = s.length();

		for (int i = 1; i <= length; i++) {
			System.out.print(s.charAt(length - i));
		}
		System.out.println();
			if (length % 2 == 1) {

				System.out.println("The middle character is " +  s.charAt(length/2));
			}
			 else {
					System.out.println("The middle character is " + s.charAt((length/2) - 1));

			}

	}
}
