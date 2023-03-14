//all Data Types reading from the user
import java.lang.*;
import java.util.*;
class datatypes
{
	public static void main(String args[])
	{
		//This is because we need to create a Scanner object to read input from the user
		Scanner user = new Scanner(System.in); 
		
		//Data Types
		int inum; float fnum; double dnum; long lnum;
		char cchar; 
		
		System.out.println("Enter Integer: ");
		inum = user.nextInt();
		
		System.out.println("Enter Floating Point: ");
		fnum = user.nextFloat();
		
		System.out.println("Enter Double [F.P]: ");
		dnum = user.nextDouble(); 
		
		System.out.println("Enter Long: ");
		lnum = user.nextLong();
		
		System.out.println("Enter Character: ");
		cchar = user.next().charAt(0);
		
		//All Results
		System.out.println("Result Interger: " + inum);
		System.out.println("Result floating point: " + fnum);
		System.out.println("Result Double (floating point): " + dnum);
		System.out.println("Result long Interger: " + lnum);
		System.out.println("Result Character: " + cchar);
		
	}
}