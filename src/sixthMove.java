

public class sixthMove 
{
	public int p1w;
	public int p2w;
	public int draw;
	public seventhMove[] a;
	public int[] state;
	
	public sixthMove()
	{
		p1w = 0;
		p2w = 0;
		draw = 0;
		state = new int[9];
		a = new seventhMove[3];
		for(int i = 0; i < 3; i++)
		{
			a[i] = new seventhMove();
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
