
public class MDialloLib 
{
	public static boolean isPalindrome(String p)
	{
		int x = p.length();
		for(int y = 0; y < (x/2); y++)
		{
			if(p.charAt(y) != p.charAt(x - y - 1))
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isFibonnaci(int x)
	{
		if((Math.sqrt(5*x*x + 4) % 1 == 0) || ((Math.sqrt(5*x*x -4) % 1 == 0)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
