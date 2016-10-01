

public class secondMove 
{
	public int p1w;
	public int p2w;
	public int draw;
	public thirdMove[] a;
	public int[] state;
	
	public secondMove()
	{
		p1w = 0;
		p2w = 0;
		draw = 0;
		state = new int[9];
		a = new thirdMove[7];
		for(int i = 0; i < 7; i++)
		{
			a[i] = new thirdMove();
		}
		
	}
	public void play(int x)
	{
		state[x] = 2;
	}
	public void clear(int x)
	{
		state[x] = 0;
	}
}
