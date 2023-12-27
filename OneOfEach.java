
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {

		boolean boy = true;
		boolean girl = true;
		int a = 0;

		while (boy || girl) {

			if (Math.random() < 0.5) {
				boy = false;
				System.out.print("g ");
			} else {
				girl = false;
				System.out.print("b ");
			}
			a = a + 1;
		}
		System.out.println();
		System.out.println("You made it... and you now have " + a + " children");
	}
}


