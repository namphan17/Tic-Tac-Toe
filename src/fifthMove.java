
public class fifthMove 
{
	public int p1w;
	public int p2w;
	public int draw;
	public sixthMove[] a;
	public int[] state;
	
	public fifthMove()
	{
		p1w = 0;
		p2w = 0;
		draw = 0;
		state = new int[9];
		a = new sixthMove[4];
		for(int i = 0; i < 4; i++)
		{
			a[i] = new sixthMove();
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
