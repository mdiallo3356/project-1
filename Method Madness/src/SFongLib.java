
public class SFongLib 
{
	public static String quadraticSolver(double a, double b, double c) //mine
	{
		double x1;
		double x2;
		String roots;
		if((b*b) - (4*a*c) > 0) //discriminant
		{
			x1 = (-b + Math.sqrt((b*b)-4*a*c)) / (2*a); //quadratic equation
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
			x2 = (-b) / (2*a); // is discriminant is 0 there is one root with multiplicity of 2
			x1 = x2;
			roots = "The root of the equation " + a + "x^2 + " + b + "x + " + c + " = 0, " + "is "+ x2;
			return roots;
		}
	}
	public static int sumUpTo(int x) //mine
	{
		//return (x*(x + 1)) / 2 ; // just another way of doing it
		int sum;
		if(x == 1)
		{
			sum = 1;
		}
		else
		{
			sum = x + sumUpTo(x - 1); // loop, if x=5 sum = 5 + sumUpTo(4); sumUpTo(4) = 4 + sumUpTo(3) and so on..
		}
		return sum;
	}
	public static String cutOut(String mainStr, String subStr) //mine
	{
		String a = "subStr does not exist within mainstr";
		for(int i = 0; i <= mainStr.length(); i++)
		{
			if(mainStr.substring(i, subStr.length() + i).equals(subStr))
			{
				return subStr + mainStr.substring(0,i) + mainStr.substring(subStr.length() + i);
			}
		}
		return a;
	}
}
