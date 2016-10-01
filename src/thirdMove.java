

public class thirdMove 
{
	public int p1w;
	public int p2w;
	public int draw;
	public fourthMove[] a;
	public int[] state;
	
	public thirdMove()
	{
		p1w = 0;
		p2w = 0;
		draw = 0;
		state = new int[9];
		a = new fourthMove[6];
		for(int i = 0; i < 6; i++)
		{
			a[i] = new fourthMove();
		}
	}
	public void play(int x)
	{
		state[x] = 1;
	}
	public void clear(int x)
	{
		state[x] = 0;
	}
	

}
