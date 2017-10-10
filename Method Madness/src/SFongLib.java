
public class SFongLib 
{
	public static void main(String[] args)
	{
		System.out.println(quadraticSolver(1,-4,4));
		System.out.println(sumUpTo(100));
		System.out.println(cutOut("Hello" , "Hi"));
		System.out.println(isPalindrome("racecar"));
	}
	public static double quadraticSolver(double a, double b, double c)
	{
		double x = 0;
		while(x >= 0)
		{
			double y= (a*x*x) + (b*x) + c;
			if(y != 0)
			{
				x++;
			}
			if(y == 0)
			{
				break;
			}
		}
		return x;
	}
	public static int sumUpTo(int x)
	{
		return (x*(x + 1)) / 2 ;
	}
	public static String cutOut(String mainStr, String subStr)
	{
		if(mainStr.length() > 1)
		{
			return subStr.substring(0,1) + mainStr.substring(1);
		}
		else
		{
			return subStr.substring(0,1);
		}
	}
	public static boolean isPalindrome(String str)
	{
		for(int x = 0; x < str.length() - 1; x++)
		{
			if(str.charAt(x) == str.charAt((str.length() - 1) - x))
			{
				return true;
			}
		}
		return false;
	}
}
