//printing using print method these are called flags in java
import java.lang.*;

class print
{
	public static void main(String args[])
	{
		System.out.println("\nPrintting Methods | Java ");
		System.out.println("--------------------------");
		int a = 10;
		System.out.printf("Positive Numbers");
		System.out.printf("\nResult: %d",a);	//output: 5 (Normal  print)
		System.out.printf("\nResult: %5d",a);	//output:     5 (print 5 but create an space)
		System.out.printf("\nResult: %05d",a);	//output: 00005 (print 5 but also print 0 other than space)
		
		System.out.printf("\n\nNegative Numbers");
		
		int b = -50;
		System.out.printf("\n\nResult: %d",b);	//output: -50 (Normal print)
		System.out.printf("\nResult: %(5d",b);	//output: (50) (Print with brackets and create 5 spaces)
		
		System.out.printf("\n\nFormat insist of printf");
		String course = "Java";
		System.out.format("\n\nResult: %20s",course);	//we also use format its works same as printf in java
		System.out.format("\n\nResult: %-20s",course);	//minus helps to start content at the starting point
	}
}