//Volume of cuboid

import java.lang.*;
import java.util.*;

class cuboid
{
	public static void main(String arg[])
	{
		System.out.println("\nVolume of Cuboid | Java ");
		System.out.println("--------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Lenght: ");
		float length = scan.nextFloat();
		
		System.out.print("Enter Breath: ");
		float breath = scan.nextFloat();
		
		System.out.print("Enter Height: ");
		float height = scan.nextFloat();
		
		float area = 2 * (length * breath + breath * height + height * length); 
		float volume = length * breath * height;
		
		System.out.print("\n\nOutput--");
		System.out.print("\nVolume of Cuboid | " + area);
		System.out.print("\nVolume of Cuboid | " + volume);
	}
}