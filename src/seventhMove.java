
public class seventhMove 
{
	public int p1w;
	public int p2w;
	public int draw;
	public eighthMove[] a;
	public int[] state;
	
	public seventhMove()
	{
		p1w = 0;
		p2w = 0;
		draw = 0;
		state = new int[9];
		a = new eighthMove[2];
		for(int i = 0; i < 2; i++)
		{
			a[i] = new eighthMove();
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
