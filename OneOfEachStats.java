import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);
		boolean boy = true;
		boolean girl = true;
		double rnd;
		double count = 0.0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int a = 0;

		for (int i = 1; i <= T; i++) {
			while (boy || girl) {
				 rnd = generator.nextDouble();
				if (rnd < 0.5) {
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
			count = count + a;
			a=0;

			boy = true;
			girl = true;
		}

		double average = 0.0;
		average = count / T;
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
