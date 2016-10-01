

public class firstMove
{
	public int p1w;
	public int p2w;
	public int draw;
	public secondMove[] a;
	public int[] state;
	
	public firstMove()
			{
				p1w = 0;
				p2w = 0;
				draw = 0;
				state = new int[9];
				a = new secondMove[8];
				for(int i = 0; i < 8; i++)
				{
					a[i] = new secondMove();
				}
			}
	public void play(int x)
	{
		state[x] = 1;
		return;
	}
	public void clear(int x)
	{
		state[x] = 0;
	}

	
	
	public String toString()
	{
		return "";
		//return a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4] + " " + a[5] + " " + a[6] + " " + a[7] + " " + a[8]; 
	}

}
