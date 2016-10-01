

import java.util.Scanner;

public class HvAI 
{
	
	public static void play(int[][] a)
 	{	
		firstMove[] Moves = new firstMove[9];
		TicTacToeAI.mindset(Moves);
		Scanner input = new Scanner(System.in);
		
		boolean win = false;
		
		int[] state = new int[9];
		int turn = 1;
		int filled = 0;// The number of the played locations.
		int[][] store = {{-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}};//This array stores the locations which are already played.
		int move1 = 0,move2 = 0,move3 = 0,move4 = 0,move5 = 0,move6 = 0,move7 = 0,move8 = 0;
		int subturn = 0;
		
		loop1: while (!win && filled < 9)//This means the game ends whenever someone win or all nine location are played.
		
		{
			System.out.println("Turn" + turn + ": Player1 move");
			int m1 = input.nextInt();
			int n1 = input.nextInt();
			
			state[3*m1 + n1] = 1;//Whenever any player makes the move, we have new game state stored this this "state" array.
			
			/*for(int i= 0; i < 9; i++)//tracing
				{
					System.out.print(state[i] + " ");//tracing
				}//tracing
			*/
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
				TTTLibrary.say2(a);
				win = true;
				break loop1;
			}
			subturn++;
			filled++;
			if (filled == 9)
			{
				break loop1;
			}
			
			
			
			
			
			
			
			int m2 = 0, n2 = 0;
			if(subturn == 1)
			{	
				
				for(int i = 0; i < 9; i++)
				{
					boolean where = true;
					for(int j = 0; j < 9; j++)// Try to find out where the player 1 just played.
					{
						if(Moves[i].state[j] != state[j])
						{
							where = false;
							break;
						}
					}
					if (where)
					{
						move1 = i;
						break;
					}
				}
				
				int best = TTTLibrary.leastp1wMove2(Moves[move1].a);
				move2 = best;
				
				/*
				System.out.println("move2 = " + best);//tracing
				for(int i= 0; i < 9; i++)//tracing
				{
					System.out.print(Moves[move1].a[move2].state[i] + " ");//tracing
				}//tracing
				*/
				
				int location2 = 0;
				for(int i = 0; i < 9; i++)
				{ 
					if (Moves[move1].a[move2].state[i] != state[i])
					{
						location2 = i; break;
					}
				}
				state[location2] = 2;
				
				if (location2 == 0) {m2 = 0; n2 = 0;}
				if (location2 == 1) {m2 = 0; n2 = 1;}
				if (location2 == 2) {m2 = 0; n2 = 2;}
				if (location2 == 3) {m2 = 1; n2 = 0;}
				if (location2 == 4) {m2 = 1; n2 = 1;}
				if (location2 == 5) {m2 = 1; n2 = 2;}
				if (location2 == 6) {m2 = 2; n2 = 0;}
				if (location2 == 7) {m2 = 2; n2 = 1;}
				if (location2 == 8) {m2 = 2; n2 = 2;} //from the state array, we figure out the position in the 2D-array "a" by specifying the values for m2 and n2.
				
				
				store[filled][0] = m2;//save the played moves.
				store[filled][1] = n2;//save the played moves.
				//System.out.println("m2 = " + m2 + " n2 = " + n2);//tracing
				
				TTTLibrary.mark (a, m2, n2, 2);//the computer makes the move.
				if (TTTLibrary.checkwin(a))
				{
					TTTLibrary.say2(a);
					win = true;
				}
				subturn++;
				filled++;
				turn++;
				
			}
			if(subturn == 3)
			{
				for(int i = 0; i < 7; i++)
				{
					boolean where = true;
					for(int j = 0; j < 9; j++)
					{
						if(Moves[move1].a[move2].a[i].state[j] != state[j])//There is an issue in finding the move that p1 just played in the second turn.
						{
							where = false;
							break;
						}
					}
					if (where)
					{
						move3 = i;
						break;
					}
				}
				int best = TTTLibrary.leastp1wMove4(Moves[move1].a[move2].a[move3].a);
				move4 = best;
				int location2 = 0;
				for(int i = 0; i < 9; i++)
				{ 
					if (state[i] != Moves[move1].a[move2].a[move3].a[move4].state[i])// Array out of bounds.
					{
						location2 = i;
					}
				}
				state[location2] = 2;
				if (location2 == 0) {m2 = 0; n2 = 0;}
				if (location2 == 1) {m2 = 0; n2 = 1;}
				if (location2 == 2) {m2 = 0; n2 = 2;}
				if (location2 == 3) {m2 = 1; n2 = 0;}
				if (location2 == 4) {m2 = 1; n2 = 1;}
				if (location2 == 5) {m2 = 1; n2 = 2;}
				if (location2 == 6) {m2 = 2; n2 = 0;}
				if (location2 == 7) {m2 = 2; n2 = 1;}
				if (location2 == 8) {m2 = 2; n2 = 2;} //from the state array, we figure out the position in the 2D-array "a".
				
				
				store[filled][0] = m2;
				store[filled][1] = n2;
				
				TTTLibrary.mark (a, m2, n2, 2);
				if (TTTLibrary.checkwin(a))
				{
					TTTLibrary.say2(a);
					win = true;
				}
				subturn++;
				filled++;
				turn++;
				
			}
			if(subturn == 5)
			{
				for(int i = 0; i < 5; i++)
				{
					boolean where = true;
					for(int j = 0; j < 9; j++)
					{
						if(Moves[move1].a[move2].a[move3].a[move4].a[i].state[j] != state[j])
						{
							where = false;
							break;
						}
					}
					if (where)
					{
						move5 = i;
						break;
					}
				}
				int best = TTTLibrary.leastp1wMove6(Moves[move1].a[move2].a[move3].a[move4].a[move5].a);
				move6 = best;
				int location2 = 0;
				for(int i = 0; i < 9; i++)
				{ 
					if (state[i] != Moves[move1].a[move2].a[move3].a[move4].a[move5].a[move6].state[i])
					{
						location2 = i;
					}
				}
				state[location2] = 2;
				
				if (location2 == 0) {m2 = 0; n2 = 0;}
				if (location2 == 1) {m2 = 0; n2 = 1;}
				if (location2 == 2) {m2 = 0; n2 = 2;}
				if (location2 == 3) {m2 = 1; n2 = 0;}
				if (location2 == 4) {m2 = 1; n2 = 1;}
				if (location2 == 5) {m2 = 1; n2 = 2;}
				if (location2 == 6) {m2 = 2; n2 = 0;}
				if (location2 == 7) {m2 = 2; n2 = 1;}
				if (location2 == 8) {m2 = 2; n2 = 2;}
				store[filled][1] = n2;
				
				TTTLibrary.mark (a, m2, n2, 2);
				if (TTTLibrary.checkwin(a))
				{
					TTTLibrary.say2(a);
					win = true;
				}
				subturn++;
				filled++;
				turn++;
			}
			if(subturn == 7)
			{
				for(int i = 0; i < 3; i++)
				{
					boolean where = true;
					for(int j = 0; j < 9; j++)
					{
						if(Moves[move1].a[move2].a[move3].a[move4].a[move5].a[move6].a[i].state[j] != state[j])
						{
							where = false;
							break;
						}
					}
					if (where)
					{
						move7 = i;
						break;
					}
				}
				int best = TTTLibrary.leastp1wMove8(Moves[move1].a[move2].a[move3].a[move4].a[move5].a[move6].a[move7].a);
				move8 = best;
				int location2 = 0;
				for(int i = 0; i < 9; i++)
				{ 
					if (state[i] != Moves[move1].a[move2].a[move3].a[move4].a[move5].a[move6].a[move7].a[move8].state[i])
					{
						location2 = i;
					}
				}
				state[location2] = 2;
				if (location2 == 0) {m2 = 0; n2 = 0;}
				if (location2 == 1) {m2 = 0; n2 = 1;}
				if (location2 == 2) {m2 = 0; n2 = 2;}
				if (location2 == 3) {m2 = 1; n2 = 0;}
				if (location2 == 4) {m2 = 1; n2 = 1;}
				if (location2 == 5) {m2 = 1; n2 = 2;}
				if (location2 == 6) {m2 = 2; n2 = 0;}
				if (location2 == 7) {m2 = 2; n2 = 1;}
				if (location2 == 8) {m2 = 2; n2 = 2;} //from the state array, we figure out the position in the 2D-array "a".
				
				
				store[filled][0] = m2;
				store[filled][1] = n2;
				
				TTTLibrary.mark (a, m2, n2, 2);
				if (TTTLibrary.checkwin(a))
				{
					TTTLibrary.say2(a);
					win = true;
				}
				subturn++;
				filled++;
				turn++;
			}
		}

		if (filled == 9 && win == false)
		{
			System.out.println("Draw!!!");
		}	
		/*
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
		*/
	}	
}
