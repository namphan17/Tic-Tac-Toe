

import java.io.*;
import java.util.Scanner;

public class TictacToeMain
{
	public static void main(String[] args) throws IOException
	{ 
		File inFile = new File("name.txt");
		Scanner name = new Scanner(inFile);
		String player = "";
		if(name.hasNextLine())
		{
			player = name.nextLine();//Your name in the game when playing with computer.
		}
		Scanner in = new Scanner(System.in);
		System.out.println("How many Players do you want, " + player + "?");
		int NumberofPlayers = in.nextInt();
		
		
		int[][] a = {
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
				};
		
		
		boolean win = false;

		int turn = 1;
		int filled = 0;// The number of the played locations.
		int[][] store = {{-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}};//This array stores the locations which are already played.
		
		StdDraw.setXscale(0.0, 2.0);
		StdDraw.setYscale(0.0, 2.0);
		
		TTTLibrary.drawboard(0.015);
		
		StdDraw.setPenRadius(0.008);
		StdDraw.setPenColor(StdDraw.RED);
		
		if (NumberofPlayers == 2)
		{
		loop1: while (!win && filled < 9)//This means the game ends whenever someone win or all nine location are played.
		{
		double x;
		double y;
		
		loopmove1: while(true)//P1 moves
		{
			System.out.println("Turn" + turn + ": Player1 move");
			if(StdDraw.mousePressed() && TTTLibrary.in(StdDraw.mouseX(), StdDraw.mouseY()))
			{
				x = StdDraw.mouseX();
				y = StdDraw.mouseY();
				
				
					int m1 = 0;
					int n1 = 0;
					if (TTTLibrary.square1(x, y)) {m1 = 2; n1 = 0;}
					if (TTTLibrary.square2(x, y)) {m1 = 2; n1 = 1;}
					if (TTTLibrary.square3(x, y)) {m1 = 2; n1 = 2;}
					if (TTTLibrary.square4(x, y)) {m1 = 1; n1 = 0;}
					if (TTTLibrary.square5(x, y)) {m1 = 1; n1 = 1;}
					if (TTTLibrary.square6(x, y)) {m1 = 1; n1 = 2;}
					if (TTTLibrary.square7(x, y)) {m1 = 0; n1 = 0;}
					if (TTTLibrary.square8(x, y)) {m1 = 0; n1 = 1;}
					if (TTTLibrary.square9(x, y)) {m1 = 0; n1 = 2;}
					for (int i = 0; i < 9; i++)
					{
						if (m1 == store[i][0] && n1 == store[i][1])
						{
							System.out.println("Try again!");
							while(true)
							{
								if(StdDraw.mousePressed())
								{
									x = StdDraw.mouseX();
									y = StdDraw.mouseY();
									if(TTTLibrary.in(x, y))
									{
										if (TTTLibrary.square1(x, y)) {m1 = 2; n1 = 0;}
										if (TTTLibrary.square2(x, y)) {m1 = 2; n1 = 1;}
										if (TTTLibrary.square3(x, y)) {m1 = 2; n1 = 2;}
										if (TTTLibrary.square4(x, y)) {m1 = 1; n1 = 0;}
										if (TTTLibrary.square5(x, y)) {m1 = 1; n1 = 1;}
										if (TTTLibrary.square6(x, y)) {m1 = 1; n1 = 2;}
										if (TTTLibrary.square7(x, y)) {m1 = 0; n1 = 0;}
										if (TTTLibrary.square8(x, y)) {m1 = 0; n1 = 1;}
										if (TTTLibrary.square9(x, y)) {m1 = 0; n1 = 2;}

										i = -1;
										break;
									}
								}
							}
						}	
					}
					store[filled][0] = m1;
					store[filled][1] = n1;
					
					
					TTTLibrary.mark (a, m1, n1, 1);//play with the array (in the terminal). 
					
					
					
					if (TTTLibrary.checkwin(a))
					{
						TTTLibrary.play(StdDraw.mouseX(), StdDraw.mouseY(), 1); StdDraw.show();
						TTTLibrary.say(a);
						TTTLibrary.announce(a);
						StdDraw.show();
						win = true;
						break loop1;
					}
					
					
					filled++;
					if (filled == 9)
					{
						TTTLibrary.play(StdDraw.mouseX(), StdDraw.mouseY(), 1); StdDraw.show();
						break loop1;
					}
					
					TTTLibrary.play(StdDraw.mouseX(), StdDraw.mouseY(), 1);//Graphically play.
					break loopmove1;
				
			}
		}
		StdDraw.show(500);
		
		
		
		loopmove2: while(true)//P2 moves
		{
			System.out.println("Turn" + turn + ": Player2 move");
			if(StdDraw.mousePressed() && TTTLibrary.in(StdDraw.mouseX(), StdDraw.mouseY()))
			{
				x = StdDraw.mouseX();
				y = StdDraw.mouseY();
				
					int m2 = 0;
					int n2 = 0;
					if (TTTLibrary.square1(x, y)) {m2 = 2; n2 = 0;}
					if (TTTLibrary.square2(x, y)) {m2 = 2; n2 = 1;}
					if (TTTLibrary.square3(x, y)) {m2 = 2; n2 = 2;}
					if (TTTLibrary.square4(x, y)) {m2 = 1; n2 = 0;}
					if (TTTLibrary.square5(x, y)) {m2 = 1; n2 = 1;}
					if (TTTLibrary.square6(x, y)) {m2 = 1; n2 = 2;}
					if (TTTLibrary.square7(x, y)) {m2 = 0; n2 = 0;}
					if (TTTLibrary.square8(x, y)) {m2 = 0; n2 = 1;}
					if (TTTLibrary.square9(x, y)) {m2 = 0; n2 = 2;}
					for (int i = 0; i < filled; i++)
					{
						if (m2 == store[i][0] && n2 == store[i][1])
						{
							System.out.println("Try again!");
							while(true)
							{
								if(StdDraw.mousePressed())
								{
									x = StdDraw.mouseX();
									y = StdDraw.mouseY();
									if(TTTLibrary.in(x, y))
									{
										if (TTTLibrary.square1(x, y)) {m2 = 2; n2 = 0;}
										if (TTTLibrary.square2(x, y)) {m2 = 2; n2 = 1;}
										if (TTTLibrary.square3(x, y)) {m2 = 2; n2 = 2;}
										if (TTTLibrary.square4(x, y)) {m2 = 1; n2 = 0;}
										if (TTTLibrary.square5(x, y)) {m2 = 1; n2 = 1;}
										if (TTTLibrary.square6(x, y)) {m2 = 1; n2 = 2;}
										if (TTTLibrary.square7(x, y)) {m2 = 0; n2 = 0;}
										if (TTTLibrary.square8(x, y)) {m2 = 0; n2 = 1;}
										if (TTTLibrary.square9(x, y)) {m2 = 0; n2 = 2;}

										i = -1;
										break;
									}
								}
							}
						}	
					}
					store[filled][0] = m2;
					store[filled][1] = n2;
					
					TTTLibrary.mark (a, m2, n2, 2);
					if (TTTLibrary.checkwin(a))
					{
						TTTLibrary.announce(a);
						win = true;
					}
					filled++;
					turn++;
				
					TTTLibrary.play(StdDraw.mouseX(), StdDraw.mouseY(), 2);
					break loopmove2;
				}
		}
			StdDraw.show(500);
		}
		

		if (filled == 9 && win == false)
		{
			System.out.println("Draw!!!");
			StdDraw.setFont(StdDraw.Font1);
			StdDraw.setPenColor(StdDraw.CYAN);
			StdDraw.text(1.1, 1.9, "Draw!!!");StdDraw.show();
		}
	}
		
		
		
		
		
		//****************************************************************************************************************************
		//****************************************************************************************************************************
		
		
		else//Play with Computer.
		{
			firstMove[] Moves = new firstMove[9];
			TicTacToeAI.mindset(Moves);
			
			
			
			int[] state = new int[9];
			
			int move1 = 0,move2 = 0,move3 = 0,move4 = 0,move5 = 0,move6 = 0,move7 = 0,move8 = 0;
			int subturn = 0;
			
			loop1: while (!win && filled < 9)//This means the game ends whenever someone win or all nine location are played.
			
			{
				double x;
				double y;
				
				loopm1: while(true)//P1 moves
				{
					System.out.println("Turn" + turn + ": Player1 move");
					if(StdDraw.mousePressed() && TTTLibrary.in(StdDraw.mouseX(), StdDraw.mouseY()))
					{
						x = StdDraw.mouseX();
						y = StdDraw.mouseY();
						
						
							int m1 = 0;
							int n1 = 0;
							if (TTTLibrary.square1(x, y)) {m1 = 2; n1 = 0;}
							if (TTTLibrary.square2(x, y)) {m1 = 2; n1 = 1;}
							if (TTTLibrary.square3(x, y)) {m1 = 2; n1 = 2;}
							if (TTTLibrary.square4(x, y)) {m1 = 1; n1 = 0;}
							if (TTTLibrary.square5(x, y)) {m1 = 1; n1 = 1;}
							if (TTTLibrary.square6(x, y)) {m1 = 1; n1 = 2;}
							if (TTTLibrary.square7(x, y)) {m1 = 0; n1 = 0;}
							if (TTTLibrary.square8(x, y)) {m1 = 0; n1 = 1;}
							if (TTTLibrary.square9(x, y)) {m1 = 0; n1 = 2;}
							for (int i = 0; i < 9; i++)
							{
								if (m1 == store[i][0] && n1 == store[i][1])
								{
									System.out.println("Try again!");
									while(true)
									{
										if(StdDraw.mousePressed())
										{
											x = StdDraw.mouseX();
											y = StdDraw.mouseY();
											if(TTTLibrary.in(x, y))
											{
												if (TTTLibrary.square1(x, y)) {m1 = 2; n1 = 0;}
												if (TTTLibrary.square2(x, y)) {m1 = 2; n1 = 1;}
												if (TTTLibrary.square3(x, y)) {m1 = 2; n1 = 2;}
												if (TTTLibrary.square4(x, y)) {m1 = 1; n1 = 0;}
												if (TTTLibrary.square5(x, y)) {m1 = 1; n1 = 1;}
												if (TTTLibrary.square6(x, y)) {m1 = 1; n1 = 2;}
												if (TTTLibrary.square7(x, y)) {m1 = 0; n1 = 0;}
												if (TTTLibrary.square8(x, y)) {m1 = 0; n1 = 1;}
												if (TTTLibrary.square9(x, y)) {m1 = 0; n1 = 2;}

												i = -1;
												break;
											}
										}
									}
								}	
							}
							store[filled][0] = m1;
							store[filled][1] = n1;
							state[3*m1 + n1] = 1;
							
							TTTLibrary.mark (a, m1, n1, 1);
							
							if (TTTLibrary.checkwin(a))
							{
								TTTLibrary.say(a);
								TTTLibrary.play(StdDraw.mouseX(), StdDraw.mouseY(), 1); StdDraw.show();
								StdDraw.setFont(StdDraw.Font1);
								StdDraw.setPenColor(StdDraw.CYAN);
								StdDraw.text(1.1, 1.9, "You won, " + player + "!!!"); StdDraw.show();
								StdDraw.setPenRadius(0.008);
								StdDraw.setPenColor(StdDraw.RED);
								win = true;
								break loop1;
							}
							filled++;
							subturn++;
							
							if (filled == 9)
							{
								TTTLibrary.play(StdDraw.mouseX(), StdDraw.mouseY(), 1); StdDraw.show();
								break loop1;
							}
							
							TTTLibrary.play(StdDraw.mouseX(), StdDraw.mouseY(), 1);
							StdDraw.show(500);
							break loopm1;//break loopm1 to go into loopm2 for the computer.
						
					}
				}
								
				
				
				
				
				
				//The computer plays.
				loopm2: while (true)
				{
				int m2 = 0, n2 = 0;
				
				//System.out.println(subturn);
				
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
						if (Moves[move1].a[move2].state[i] != state[i])//This statement help figure out where to play, according to the best move.
						{
							location2 = i; break;
						}
					}
					state[location2] = 2;
					
					if (location2 == 0) {m2 = 0; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 1.5, 0.15);StdDraw.show();}
					if (location2 == 1) {m2 = 0; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 1.5, 0.15);StdDraw.show();}
					if (location2 == 2) {m2 = 0; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 1.5, 0.15);StdDraw.show();}
					if (location2 == 3) {m2 = 1; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 1.0, 0.15);StdDraw.show();}
					if (location2 == 4) {m2 = 1; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 1.0, 0.15);StdDraw.show();}
					if (location2 == 5) {m2 = 1; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 1.0, 0.15);StdDraw.show();}
					if (location2 == 6) {m2 = 2; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 0.5, 0.15);StdDraw.show();}
					if (location2 == 7) {m2 = 2; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 0.5, 0.15);StdDraw.show();}
					if (location2 == 8) {m2 = 2; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 0.5, 0.15);StdDraw.show();} //from the state array, we figure out the position in the 2D-array "a" by specifying the values for m2 and n2.
					
					
					store[filled][0] = m2;//save the played moves.
					store[filled][1] = n2;//save the played moves.
					//System.out.println("m2 = " + m2 + " n2 = " + n2);//tracing
					
					TTTLibrary.mark (a, m2, n2, 2);//the computer makes the move.
						/*
						if (m2 == 2 && n2 == 0){StdDraw.circle(0.5, 0.5, 0.15);}
						if (m2 == 2 && n2 == 1){StdDraw.circle(1.0, 0.5, 0.15);}
						if (m2 == 2 && n2 == 2){StdDraw.circle(1.5, 0.5, 0.15);}
						if (m2 == 1 && n2 == 0){StdDraw.circle(0.5, 1.0, 0.15);}
						if (m2 == 1 && n2 == 1){StdDraw.circle(1.0, 1.0, 0.15);}
						if (m2 == 1 && n2 == 2){StdDraw.circle(1.5, 1.0, 0.15);}
						if (m2 == 0 && n2 == 0){StdDraw.circle(0.5, 1.0, 0.15);}
						if (m2 == 0 && n2 == 1){StdDraw.circle(1.0, 1.0, 0.15);}
						if (m2 == 0 && n2 == 2){StdDraw.circle(1.5, 1.0, 0.15);}
						*/
					
					subturn++;
					filled++;
					turn++;
					break loopm2;
					
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
					
					if (location2 == 0) {m2 = 0; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 1.5, 0.15);StdDraw.show();}
					if (location2 == 1) {m2 = 0; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 1.5, 0.15);StdDraw.show();}
					if (location2 == 2) {m2 = 0; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 1.5, 0.15);StdDraw.show();}
					if (location2 == 3) {m2 = 1; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 1.0, 0.15);StdDraw.show();}
					if (location2 == 4) {m2 = 1; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 1.0, 0.15);StdDraw.show();}
					if (location2 == 5) {m2 = 1; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 1.0, 0.15);StdDraw.show();}
					if (location2 == 6) {m2 = 2; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 0.5, 0.15);StdDraw.show();}
					if (location2 == 7) {m2 = 2; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 0.5, 0.15);StdDraw.show();}
					if (location2 == 8) {m2 = 2; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 0.5, 0.15);StdDraw.show();} //from the state array, we figure out the position in the 2D-array "a".
					
					
					store[filled][0] = m2;
					store[filled][1] = n2;
					
					TTTLibrary.mark (a, m2, n2, 2);
					
					
					
					subturn++;
					filled++;
					turn++;
					break loopm2;
					
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
					
					if (location2 == 0) {m2 = 0; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 1.5, 0.15);StdDraw.show();}
					if (location2 == 1) {m2 = 0; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 1.5, 0.15);StdDraw.show();}
					if (location2 == 2) {m2 = 0; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 1.5, 0.15);StdDraw.show();}
					if (location2 == 3) {m2 = 1; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 1.0, 0.15);StdDraw.show();}
					if (location2 == 4) {m2 = 1; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 1.0, 0.15);StdDraw.show();}
					if (location2 == 5) {m2 = 1; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 1.0, 0.15);StdDraw.show();}
					if (location2 == 6) {m2 = 2; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 0.5, 0.15);StdDraw.show();}
					if (location2 == 7) {m2 = 2; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 0.5, 0.15);StdDraw.show();}
					if (location2 == 8) {m2 = 2; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 0.5, 0.15);StdDraw.show();}
					
					
					store[filled][0] = m2;
					store[filled][1] = n2;
					
					TTTLibrary.mark (a, m2, n2, 2);
					
					
					if (TTTLibrary.checkwin(a))
					{
						TTTLibrary.say2(a);
						StdDraw.setFont(StdDraw.Font1);
						StdDraw.setPenColor(StdDraw.CYAN);
						StdDraw.text(1.1, 1.9, "You lost, " + player + "!!!"); StdDraw.show();
						win = true;
						break loopm2;
					}
					subturn++;
					filled++;
					turn++;
					break loopm2;
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
					
					if (location2 == 0) {m2 = 0; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 1.5, 0.15);StdDraw.show();}
					if (location2 == 1) {m2 = 0; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 1.5, 0.15);StdDraw.show();}
					if (location2 == 2) {m2 = 0; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 1.5, 0.15);StdDraw.show();}
					if (location2 == 3) {m2 = 1; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 1.0, 0.15);StdDraw.show();}
					if (location2 == 4) {m2 = 1; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 1.0, 0.15);StdDraw.show();}
					if (location2 == 5) {m2 = 1; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 1.0, 0.15);StdDraw.show();}
					if (location2 == 6) {m2 = 2; n2 = 0; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(0.5, 0.5, 0.15);StdDraw.show();}
					if (location2 == 7) {m2 = 2; n2 = 1; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.0, 0.5, 0.15);StdDraw.show();}
					if (location2 == 8) {m2 = 2; n2 = 2; StdDraw.setPenRadius(0.008); StdDraw.setPenColor(StdDraw.RED); StdDraw.circle(1.5, 0.5, 0.15);StdDraw.show();} //from the state array, we figure out the position in the 2D-array "a".
					StdDraw.show();
					
					store[filled][0] = m2;
					store[filled][1] = n2;
					
					TTTLibrary.mark (a, m2, n2, 2);
					
					
					if (TTTLibrary.checkwin(a))
					{
						TTTLibrary.say2(a);
						StdDraw.setFont(StdDraw.Font1);
						StdDraw.setPenColor(StdDraw.CYAN);
						StdDraw.text(1.1, 1.9, "You lost, " + player + "!!!"); StdDraw.show();
						win = true;
						break loopm2;
					}
					subturn++;
					filled++;
					turn++;
					break loopm2;
				}
			}
			
		}

			if (filled == 9 && win == false)
			{
				System.out.println("Draw!!!");
				StdDraw.setFont(StdDraw.Font1);
				StdDraw.setPenColor(StdDraw.CYAN);
				StdDraw.text(1.1, 1.9, "Draw!!!");StdDraw.show();
				
			}	
		}
	
	
	}
}
