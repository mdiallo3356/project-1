
public class SFongLib 
{
	public static void main(String[] args)
	{
		System.out.println(quadraticSolver(1,4,4));
		System.out.println(sumUpTo(100));
		System.out.println(cutOut("Hello" , "Hi"));
		System.out.println(isPalindrome("racecar"));
		System.out.println(isFibonacci(6));
	}
	public static String quadraticSolver(double a, double b, double c) //mine
	{
		double x1;
		double x2;
		String roots;
		if((b*b) - (4*a*c) > 0)
		{
			x1 = (-b + Math.sqrt((b*b)-4*a*c)) / (2*a);
			x2 = (-b - Math.sqrt((b*b)-4*a*c)) / (2*a);
			roots = "The roots of the equation " + a + "x^2 + " + b + "x + " + c + " = 0, " + "are " + x1 + ", " + x2 + ".";
			return roots;
		}
		if((b*b) - (4*a*c) < 0)
		{
			roots = "The roots are non-real numbers";
			return roots;
		}
		else
		{
			x2 = (-b) / (2*a);
			x1 = x2;
			roots = "The root of the equation " + a + "x^2 + " + b + "x + " + c + " = 0, " + "is "+ x2;
			return roots;
		}
	}
	public static int sumUpTo(int x) //mine
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
	public static String cutOut(String mainStr, String subStr) //mine
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
	public static boolean isPalindrome(String str) //extra
	{
		for(int i = 0; i < str.length()/2; i++)
		{
			if(str.charAt(i) == str.charAt((str.length() - 1) - i))
			{
				return true;
			}
		}
		return false;
	}
	public static int isFibonacci(int num)
	{
		int F0 = 0;
		int F1 = 1;
		int F2;
		int result = 0;
		if(num > 0)
		{
			F2 = F1 + F0;
			F0 = F1;
			F1 = F2;
			result = F2 + isFibonacci(num - 1);
		}
		return result;
	}
}
