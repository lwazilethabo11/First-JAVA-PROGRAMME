import java.util.Scanner;
public class First1{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in); 
		//declare variables
		String myName;
		int age;
		//input
		System.out.print("what is your name:");
		myName = kb.nextLine();
		System.out.print("how old are you:");
		age = kb.nextInt();
		//output
		System.out.print("your name is " + myName + " and you are " + age);
		
	}
}