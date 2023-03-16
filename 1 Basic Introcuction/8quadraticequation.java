//Quadratic Equaation
import java.lang.*;
import java.util.*;
class quadratics
{
	public static void main(String args[])
	{
		System.out.println("\nQuadratic Equation | Java ");
		System.out.println("----------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scan.nextInt();
		System.out.print("Enter b: ");
		int b = scan.nextInt();
		System.out.print("Enter c: ");
		int c = scan.nextInt();
		
		double quadratic1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		double quadratic2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.println("\n\nResult 01 | " + quadratic1);
		System.out.println("Result 02 | " + quadratic2);
	}
}