



public class TTTLibrary {
	public static void mark(int[][] a, int x, int y, int t)//This method help us make a specific move for the game.
	{	
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (i == x && j == y)
				{
				a[i][j] = t;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static boolean top(int[][] a)
	{
		if ((a[0][0] != 0) && (a[0][0] == a[0][1]) && (a[0][0] == a[0][2])){return true;}
		else{return false;}
			
	}
	public static boolean bot(int[][] a)
	{
		if ((a[2][0] != 0) && (a[2][0] == a[2][1]) && (a[2][0] == a[2][2])){return true;}
		else{return false;}
			
	}
	public static boolean right(int[][] a)
	{
		if ((a[0][0] != 0) && (a[0][0] == a[1][0] && a[0][0] == a[2][0])){return true;}
		else{return false;}
			
	}
	public static boolean left(int[][] a)
	{
		if ((a[0][2] != 0) && (a[0][2] == a[1][2]) && (a[0][2] == a[2][2])){return true;}
		else{return false;}
			
	}
	public static boolean diag1(int[][] a)
	{
		if ((a[0][0] != 0) && (a[0][0] == a[1][1]) && (a[0][0] == a[2][2])){return true;}
		else{return false;}
			
	}
	public static boolean diag2(int[][] a)
	{
		if ((a[0][2] != 0) && (a[0][2] == a[1][1]) && (a[0][2] == a[2][0])){return true;}
		else{return false;}
			
	}
	public static boolean midver(int[][] a)
	{
		if ((a[1][1] != 0) && (a[0][1] == a[1][1]) && (a[1][1] == a[2][1])){return true;}
		else{return false;}
			
	}
	public static boolean midhor(int[][] a)
	{
		if ((a[1][1] != 0) && (a[1][0] == a[1][1]) && (a[1][0] == a[1][2])){return true;}
		else{return false;}
			
	}
	public static boolean checkwin(int[][] a)
	{
		if (top(a) || bot(a) || right(a) || left(a) || diag1(a) || diag2(a) || midver(a) || midhor(a))
		{	
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void say(int[][] a)
	{
		if (top(a)) 		{ if (a[0][0] == 1) {System.out.println("Player1 won!!!");}		else {System.out.println("Player2 won!!!");}	}
		if (bot(a)) 		{ if (a[2][0] == 1) {System.out.println("Player1 won!!!");}		else {System.out.println("Player2 won!!!");}	}
		if (right(a)) 		{ if (a[0][0] == 1) {System.out.println("Player1 won!!");}		else {System.out.println("Player2 won!!!");}	}
		if (left(a)) 		{ if (a[0][2] == 1) {System.out.println("Player1 won!!!");}		else {System.out.println("Player2 won!!!");}	}
		if (diag1(a)) 		{ if (a[1][1] == 1) {System.out.println("Player1 won!!!");}		else {System.out.println("Player2 won!!!");}	}
		if (diag2(a)) 		{ if (a[1][1] == 1) {System.out.println("Player1 won!!!");}		else {System.out.println("Player2 won!!!");}	}
		if (midver(a)) 		{ if (a[1][1] == 1) {System.out.println("Player1 won!!!");}		else {System.out.println("Player2 won!!!");}	}
		if (midhor(a)) 		{ if (a[1][1] == 1) {System.out.println("Player1 won!!!");}		else {System.out.println("Player2 won!!!");}	}
	}
	public static void say2(int[][] a)
	{
		if (top(a)) 		{ if (a[0][0] == 1) {System.out.println("You won!!!");}		else {System.out.println("You lost!!!");}	}
		if (bot(a)) 		{ if (a[2][0] == 1) {System.out.println("You won!!!");}		else {System.out.println("You lost!!!");}	}
		if (right(a)) 		{ if (a[0][0] == 1) {System.out.println("You won!!!");}		else {System.out.println("You lost!!!");}	}
		if (left(a)) 		{ if (a[0][2] == 1) {System.out.println("You won!!!");}		else {System.out.println("You lost!!!");}	}
		if (diag1(a)) 		{ if (a[1][1] == 1) {System.out.println("You won!!!");}		else {System.out.println("You lost!!!");}	}
		if (diag2(a)) 		{ if (a[1][1] == 1) {System.out.println("You won!!!");}		else {System.out.println("You lost!!!");}	}
		if (midver(a)) 		{ if (a[1][1] == 1) {System.out.println("You won!!!");}		else {System.out.println("You lost!!!");}	}
		if (midhor(a)) 		{ if (a[1][1] == 1) {System.out.println("You won!!!");}		else {System.out.println("You lost!!!");}	}
	}
	public static void announce(int[][] a)
	{ 	
		StdDraw.setFont(StdDraw.Font1);
		StdDraw.setPenColor(StdDraw.CYAN);
		if (top(a)) 		{ if (a[0][0] == 1) {StdDraw.text(1.1, 1.9, "Player1 won!!!");}		else {StdDraw.text(1.1, 1.9, "Player2 won!!!");}	}
		if (bot(a)) 		{ if (a[2][0] == 1) {StdDraw.text(1.1, 1.9, "Player1 won!!!");}		else {StdDraw.text(1.1, 1.9, "Player2 won!!!");}	}
		if (right(a)) 		{ if (a[0][0] == 1) {StdDraw.text(1.1, 1.9, "Player1 won!!!");}		else {StdDraw.text(1.1, 1.9, "Player2 won!!!");}	}
		if (left(a)) 		{ if (a[0][2] == 1) {StdDraw.text(1.1, 1.9, "Player1 won!!!");}		else {StdDraw.text(1.1, 1.9, "Player2 won!!!");}	}
		if (diag1(a)) 		{ if (a[1][1] == 1) {StdDraw.text(1.1, 1.9, "Player1 won!!!");}		else {StdDraw.text(1.1, 1.9, "Player2 won!!!");}	}
		if (diag2(a)) 		{ if (a[1][1] == 1) {StdDraw.text(1.1, 1.9, "Player1 won!!!");}		else {StdDraw.text(1.1, 1.9, "Player2 won!!!");}	}
		if (midver(a)) 		{ if (a[1][1] == 1) {StdDraw.text(1.1, 1.9, "Player1 won!!!");}		else {StdDraw.text(1.1, 1.9, "Player2 won!!!");}	}
		if (midhor(a)) 		{ if (a[1][1] == 1) {StdDraw.text(1.1, 1.9, "Player1 won!!!");}		else {StdDraw.text(1.1, 1.9, "Player2 won!!!");}	}
		StdDraw.setPenRadius(0.008);
		StdDraw.setPenColor(StdDraw.RED);
	}
	
	
	public static void pointer(int a, int m, int n)
	{
		if (a == 0) {m = 0; n = 0;}
		if (a == 1) {m = 0; n = 1;}
		if (a == 2) {m = 0; n = 2;}
		if (a == 3) {m = 1; n = 0;}
		if (a == 4) {m = 1; n = 1;}
		if (a == 5) {m = 1; n = 2;}
		if (a == 6) {m = 2; n = 0;}
		if (a == 7) {m = 2; n = 1;}
		if (a == 8) {m = 2; n = 2;}
		
		/*switch(a)
		{
		case 0: m = 0; n = 0; break;
		case 1: m = 0; n = 1; break;
		case 2: m = 0; n = 2; break;
		case 3: m = 1; n = 0; break;
		case 4: m = 1; n = 1; break;
		case 5: m = 1; n = 2; break;
		case 6: m = 2; n = 0; break;
		case 7: m = 2; n = 1; break;
		case 8: m = 2; n = 2; break;
		}*/
	}
	public static int mostp1wMove1(firstMove[] Moves)
	{
		int best = 0;
		int max = Moves[0].p1w;
		for (int i = 0; i < 9; i++)
		{
			if (Moves[i].p1w > max)
			{
				max = Moves[i].p1w;
				best = i;
			}
		}
		return best;
	}
	public static int leastp1wMove2(secondMove[] fm)
	{
		int best = 0;
		int min = fm[0].p1w;
		for (int i = 0; i < 8; i++)
		{
			if (fm[i].p1w < min)
			{
				min = fm[i].p1w;
				best = i;
			}
		}
		return best;
	}
	public static int mostp1wMove3(thirdMove[] sm)
	{
		int best = 0;
		int max = sm[0].p1w;
		for (int i = 0; i < 7; i++)
		{
			if (sm[i].p1w > max)
			{
				max = sm[i].p1w;
				best = i;
			}
		}
		return best;
	}
	public static int leastp1wMove4(fourthMove[] thirm)
	{
		int best = 0;
		int min = thirm[0].p1w;
		for (int i = 0; i < 6; i++)
		{
			if (thirm[i].p1w < min)
			{
				min = thirm[i].p1w;
				best = i;
			}
		}
		return best;
	}
	public static int mostp1wMove5(fifthMove[] form)
	{
		int best = 0;
		int max = form[0].p1w;
		for (int i = 0; i < 5; i++)
		{
			if (form[i].p1w > max)
			{
				max = form[i].p1w;
				best = i;
			}
		}
		return best;
	}
	public static int leastp1wMove6(sixthMove[] fifm)
	{
		int best = 0;
		int min = fifm[0].p1w;
		for (int i = 0; i < 4; i++)
		{
			if (fifm[i].p1w < min)
			{
				min = fifm[i].p1w;
				best = i;
			}
		}
		return best;
	}
	public static int mostp1wMove7(seventhMove[] sixm)
	{
		int best = 0;
		int max = sixm[0].p1w;
		for (int i = 0; i < 3; i++)
		{
			if (sixm[i].p1w > max)
			{
				max = sixm[i].p1w;
				best = i;
			}
		}
		return best;
	}
	public static int leastp1wMove8(eighthMove[] sevm)
	{
		int best = 0;
		int min = sevm[0].p1w;
		for (int i = 0; i < 2; i++)
		{
			if (sevm[i].p1w < min)
			{
				min = sevm[i].p1w;
				best = i;
			}
		}
		return best;
	}

	public static boolean square1(double x, double y)
	{
		if ( x > 0.25&& x < 0.75 && y > 0.25 && y < 0.75)
		{
			return true;
		}
		return false;
	}
	public static boolean square2(double x, double y)
	{
		if ( x > 0.75 && x < 1.25 && y > 0.25 && y < 0.75)
		{
			return true;
		}
		return false;
	}
	public static boolean square3(double x, double y)
	{
		if ( x > 1.25 && x < 1.75 && y > 0.25 && y < 0.75)
		{
			return true;
		}
		return false;
	}
	public static boolean square4(double x, double y)
	{
		if ( x > 0.25 && x < 0.75 && y > 0.75 && y < 1.25)
		{
			return true;
		}
		return false;
	}
	public static boolean square5(double x, double y)
	{
		if ( x > 0.75 && x < 1.25 && y > 0.75 && y < 1.25)
		{
			return true;
		}
		return false;
	}
	public static boolean square6(double x, double y)
	{
		if ( x > 1.25 && x < 1.75 && y > 0.75 && y < 1.25)
		{
			return true;
		}
		return false;
	}
	public static boolean square7(double x, double y)
	{
		if ( x > 0.25 && x < 0.75 && y > 1.25 && y < 1.75)
		{
			return true;
		}
		return false;
	}
	public static boolean square8(double x, double y)
	{
		if ( x > 0.75 && x < 1.25 && y > 1.25 && y < 1.75)
		{
			return true;
		}
		return false;
	}
	public static boolean square9(double x, double y)

	{
		if ( x > 1.25 && x < 1.75 && y > 1.25 && y < 1.75)
		{
			return true;
		}
		return false;
	}
	public static boolean in(double x, double y)
	{
		if (square1(x, y)||square2(x, y)||square3(x, y)||square4(x, y)||square5(x, y)||square6(x, y)||square7(x, y)||square8(x, y)||square9(x, y))
			return true;
		else
			return false;
	}
	public static int[] pos(double x, double y)
	{	
		int[] a = {3, 3};
		if (square1(x, y))
		{
			a[0] = 2;
			a[1] = 0;
		}
		if (square2(x, y))
		{
			a[0] = 2;
			a[1] = 1;
		}
		if (square3(x, y))
		{
			a[0] = 2;
			a[1] = 2;
		}
		if (square4(x, y))
		{
			a[0] = 1;
			a[1] = 0;
		}
		if (square5(x, y))
		{
			a[0] = 1;
			a[1] = 1;
		}
		if (square6(x, y))
		{
			a[0] = 1;
			a[1] = 2;
		}
		if (square7(x, y))
		{
			a[0] = 0;
			a[1] = 0;
		}
		if (square8(x, y))
		{
			a[0] = 0;
			a[1] = 1;
		}
		if (square9(x, y))
		{
			a[0] = 0;
			a[1] = 2;
		}
		return a;
	}
	public static void cross(double x1, double x2, double y1, double y2)
	{
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x1, y2, x2, y1);
	}
	public static void play(double m, double n, int player)
	{
		if (square1(m, n))
		{
			if (player == 1) {cross(0.35, 0.65, 0.35, 0.65);}
			else {StdDraw.circle(0.5, 0.5, 0.15);}
		}
		if (square2(m, n))
		{
			if (player == 1) {cross(0.85, 1.15, 0.35, 0.65);}
			else {StdDraw.circle(1.0, 0.5, 0.15);}
		}
		if (square3(m, n))
		{
			if (player == 1) {cross(1.35, 1.65, 0.35, 0.65);}
			else {StdDraw.circle(1.5, 0.5, 0.15);}
		}
		if (square4(m, n))
		{
			if (player == 1) {cross(0.35, 0.65, 0.85, 1.15);}
			else {StdDraw.circle(0.5, 1.0, 0.15);}
		}
		if (square5(m, n))
		{
			if (player == 1) {cross(0.85, 1.15, 0.85, 1.15);}
			else {StdDraw.circle(1.0, 1.0, 0.15);}
		}
		if (square6(m, n))
		{
			if (player == 1) {cross(1.35, 1.65, 0.85, 1.15);}
			else {StdDraw.circle(1.5, 1.0, 0.15);}
		}
		if (square7(m, n))
		{
			if (player == 1) {cross(0.35, 0.65, 1.35, 1.65);}
			else {StdDraw.circle(0.5, 1.5, 0.15);}
		}
		if (square8(m, n))
		{
			if (player == 1) {cross(0.85, 1.15, 1.35, 1.65);}
			else {StdDraw.circle(1.0, 1.5, 0.15);}
		}
		if (square9(m, n))
		{
			if (player == 1) {cross(1.35, 1.65, 1.35, 1.65);}
			else {StdDraw.circle(1.5, 1.5, 0.15);}
		}
	}

	public static void drawboard(double a)
	{
		StdDraw.filledSquare(0.0, 0.0, 3);
		
		StdDraw.setPenRadius(a);
		StdDraw.setPenColor(StdDraw.WHITE);

		StdDraw.square(0.5, 0.5, 0.25);// 0.25 < x < 0.75; 0.25 < y < 0.75
		StdDraw.square(0.5, 1.0, 0.25);// 0.25 < x < 0.75; 0.75 < y < 1.25
		StdDraw.square(0.5, 1.5, 0.25);// 0.25 < x < 0.75; 1.25 < y < 1.75
		StdDraw.square(1.0, 0.5, 0.25);// 0.75 < x < 1.25; 0.25 < y < 0.75
		StdDraw.square(1.0, 1.5, 0.25);// 0.75 < x < 1.25; 0.75 < y < 1.25
		StdDraw.square(1.0, 1.0, 0.25);// 0.75 < x < 1.25; 1.25 < y < 1.75
		StdDraw.square(1.5, 0.5, 0.25);// 1.25 < x < 1.75; 0.25 < y < 0.75
		StdDraw.square(1.5, 1.0, 0.25);// 1.25 < x < 1.75; 0.75 < y < 1.25
		StdDraw.square(1.5, 1.5, 0.25);// 1.25 < x < 1.75; 1.25 < y < 1.75
	}
	
}
