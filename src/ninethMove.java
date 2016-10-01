
public class ninethMove 
{
	public int p1w;
	public int p2w;
	public int draw;
	public int[] state;
	
	public ninethMove()
	{
		p1w = 0;
		p2w = 0;
		draw = 0;
		state = new int[9];
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
