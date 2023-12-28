/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		int x = (int) ((10) * Math.random());
		int i = x;
		int b = x;
		System.out.print(i + " ");
		do {
			b = i;
			i = (int) (10 * Math.random());
			if (i >= b) {
				System.out.print(i + " ");
			}
		}
		while (i >= x && i >= b);
		{

		}
	}
}


