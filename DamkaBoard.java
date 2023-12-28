/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		for (int b = 1; b <= N; b++) {

			if(b % 2 == 0)
			{
				System.out.print(" ");
			}

			for (int i = 1; i <= N; i++) {
				if ( i <  N ){
					System.out.print("* ");
			}
			
				else { 
					System.out.print("*")
					
				}
			}
			System.out.println();

		}
	}
}
