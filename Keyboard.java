import java.lang.*;
import java.util.*;

class Keyboard{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Input two numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		c = a+b;
		
		System.out.println("The sum is" + " " + c);
	};
};