//Calculate area of (Right area triangle)
//Note In java 2 main function in one class not allowed but 2 different class allowed
import java.lang.*;
import java.util.*;
class areaofrighttriangle
{
	public static void main(String args[])
	{
		System.out.println("\nArea of Right angle Triangle | Java ");
		System.out.println("------------------------------------");
		Scanner scan = new Scanner(System.in);
		int base, height;
		float area;
		System.out.print("Enter Base: ");
		base = scan.nextInt();
		System.out.print("Enter Height ");
		height = scan.nextInt();
		
		area = 0.5f * base * height;
		
		System.out.print("\n\nResult | Area of Triangle: " + area);
		
	}
}

//area of three sides of a triangle
class areaofthreesides
{
	public static void main(String args[])
	{
		System.out.println("\nArea of Three sides Triangle | Java ");
		System.out.println("------------------------------------");
		System.out.print("Enter a: ");
		Scanner scan = new Scanner(System.in);
		float a = scan.nextInt();
		System.out.print("Enter b: ");
		float b = scan.nextInt();
		System.out.print("Enter c: ");
		float c = scan.nextInt();
		
		float s = (a+b+c) / 2f;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("\n\nResult | Area of Three sides Triangle: " + area);
	}
}