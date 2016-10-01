

public class eighthMove 
{
	public int p1w;
	public int p2w;
	public int draw;
	public ninethMove[] a;
	public int[] state;
	
	public eighthMove()
	{
		p1w = 0;
		p2w = 0;
		draw = 0;
		a = new ninethMove[1]; 
		a[0] = new ninethMove();
		state = new int[9];
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
