import java.util.Scanner;

public class Test
{
	static boolean A;
	static boolean B;
	static boolean C; 
	static boolean D;
	
	public static void main(String[] args)
	{
		boolean more = true;
		
		while(more)
		{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Value of A");
			int a = Integer.parseInt(keyboard.nextLine());
			System.out.println("Value of B");
			int b = Integer.parseInt(keyboard.nextLine());
			System.out.println("Value of C");
			int c = Integer.parseInt(keyboard.nextLine());
			System.out.println("Value of D");
			int d = Integer.parseInt(keyboard.nextLine());
			
			int[] values = {a, b, c, d};
			boolean[] truths = new boolean[4];
			
			for(int i = 0; i < 4; i++)
			{
				if(values[i] == 1)
					truths[i] = true;
				else
					truths[i] = false;
			}
			
			A = truths[0];
			B = truths[1];
			C = truths[2];
			D = truths[3];
			
			boolean g1 = Gates.xnor(A, B);
			boolean g2 = Gates.or(g1, B);
			boolean g3 = Gates.not(C);
			boolean g4 = Gates.nand(g2, g3);
			boolean g5 = Gates.and(D, D);
			boolean g6 = Gates.not(g5);
			boolean g7 = Gates.xor(g4, g6);
			
			System.out.println("Answer:");
			
			if(g7)
				System.out.println(1);
			else
				System.out.println(0);
			
			System.out.println("Would you like to do more calculations?");
			System.out.println("Type 'y' for yes and 'n' for no");
			
			String response = keyboard.nextLine();
			char responseChar = response.charAt(0);
			
			if(responseChar == 'y')
				more = true;
			else if(responseChar == 'n')
				more = false;
			else
			{
				System.out.println("Error. Invalid response.");
				more = false;
			}
		}
	}
}