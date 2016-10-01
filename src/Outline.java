

import java.io.*;
import java.util.Scanner;

public class Outline
{
	public static void main(String[] args) throws IOException
	{
		/*
		StdDraw.setXscale(0.0, 2.5);
		StdDraw.setYscale(0.0, 2.5);
		StdDraw.filledSquare(0.0, 0.0, 3);
	
		StdDraw.setPenRadius(0.015);
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
		StdDraw.setPenRadius(0.008);
		StdDraw.setPenColor(StdDraw.RED);
		*/
		
		
		int[][] a = {
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
				};
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		if (x == 2)
		{
			HvH.play(a);
		}
		if (x == 1)
		{
			HvAI.play(a);
		}
		in.close();
	}
}

