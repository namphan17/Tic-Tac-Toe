
public class fourthMove 
{
	public int p1w;
	public int p2w;
	public int draw;
	public fifthMove[] a;
	public int[] state;
	
	public fourthMove()
	{
		p1w = 0;
		p2w = 0;
		draw = 0;
		state = new int[9];
		a = new fifthMove[5];
		for(int i = 0; i < 5; i++)
		{
			a[i] = new fifthMove();
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
