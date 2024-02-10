package stackbrackets;

import java.util.Scanner;

public class DriverApp {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the input values");
	String input=scanner.next();
	 
	MyStack ms=new MyStack();
	if(input.length()%2==1)
	{
		System.out.println("incomplete expression");
	}
	else
	{
	if(ms.validate(input))
		System.out.println("valid expression");
	else 
		System.out.println("invalid expression");
	}
}
}
