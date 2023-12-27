/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		boolean boy = true;
		boolean girl = true;
		int count = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int a = 0;

		for (int i = 1; i <= T; i++) {
			while (boy || girl) {

				if (Math.random() < 0.5) {
					boy = false;
				} else {
					girl = false;
				}
				a++;
			}
			if (a == 2) {
				num2 = num2 + 1;
				} else {
				if (a == 3) {
					num3 = num3 + 1;
				} else {
					num4 = num4 + 1;
				}
			}

				System.out.println();
				count = count + a;
				a=0;

			boy = true;
			girl = true;
		}

		int average = count / T;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + num2);
		System.out.println("Number of families with 3 children: " + num3);
		System.out.println("Number of families with 4 or more children: " + num4);

		if ((num2 >= num3) && (num2 >= num4)) {
			System.out.println("The most common number of children is 2.");
		} else {
			if ((num3 >= num2) && (num3 >= num4)) {
				System.out.println("The most common number of children is 3.");
			} else {
				System.out.println("The most common number of children is 4 or more.");
			}
		}
	}
}







