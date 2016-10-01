

import java.util.Scanner;

public class HvH {
	public static void play(int[][] a)
	{

		
		Scanner input = new Scanner(System.in);
		
		boolean win = false;

		int turn = 1;
		int filled = 0;// The number of the played locations.
		int[][] store = {{-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}};//This array stores the locations which are already played.
		
		loop1: while (!win && filled < 9)//This means the game ends whenever someone win or all nine location are played.
		
		{
			System.out.println("Turn" + turn + ": Player1 move");
			int m1 = input.nextInt();
			int n1 = input.nextInt();
			for (int i = 0; i < 9; i++)
			{
				if (m1 == store[i][0] && n1 == store[i][1])
				{
					System.out.println("Try again!");
					m1 = input.nextInt();
					n1 = input.nextInt();
					i = -1;
				}	
			}
			store[filled][0] = m1;
			store[filled][1] = n1;
			
			TTTLibrary.mark (a, m1, n1, 1);
			if (TTTLibrary.checkwin(a))
			{
				TTTLibrary.say(a);
				win = true;
				break loop1;
			}
			filled++;
			if (filled == 9)
			{
				break loop1;
			}
			
			
			
			System.out.println("Turn" + turn + ": Player2 move");
			int m2 = input.nextInt();
			int n2 = input.nextInt();
			for (int i = 0; i < filled; i++)
			{
				if (m2 == store[i][0] && n2 == store[i][1])
				{
					{
						System.out.println("Try again!");
						m2 = input.nextInt();
						n2 = input.nextInt();
						i = -1;
					}
				}	
			}
			store[filled][0] = m2;
			store[filled][1] = n2;
			
			TTTLibrary.mark (a, m2, n2, 2);
			if (TTTLibrary.checkwin(a))
			{
				TTTLibrary.say(a);
				win = true;
			}
			filled++;
			turn++;
		}

		if (filled == 9 && win == false)
		{
			System.out.println("Draw!!!");
		}
	}
}
