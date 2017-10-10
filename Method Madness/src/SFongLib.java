
public class SFongLib 
{
	public static void main(String[] args)
	{
		System.out.println(quadraticSolver(1,0,-4));
		System.out.println(sumUpTo(100));
		System.out.println(cutOut("Hello" , "Hi"));
		System.out.println(isPalindrome("racecar"));
	}
	public static String quadraticSolver(double a, double b, double c)
	{
		double x1;
		x1 = (-b + Math.sqrt((b*b)-4*a*c)) / (2*a);
		double x2;
		x2 = (-b - Math.sqrt((b*b)-4*a*c)) / (2*a);
		String ans = "The roots of " + a + "x^2 + " + b + "x + " + c + " = 0, " + "are " + x1 + ", " + x2 + ".";
		return ans;
	}
	public static int sumUpTo(int x)
	{
		//return (x*(x + 1)) / 2 ;
		int sum;
		if(x == 1)
		{
			sum = 1;
		}
		else
		{
			sum = x + sumUpTo(x - 1);
		}
		return sum;
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
