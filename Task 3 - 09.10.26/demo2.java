
import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number 1: ");
		
		int num1=scan.nextInt();
		
		System.out.println("Enter the Number 2: ");
		
		int num2=scan.nextInt();
		
		int Addition =num1+num2;
		
		int Subtraction=num1-num2;
		
		int Multiplication =num1*num2;
		
		double Division=num1/num2;
		
		System.out.println("Addition: "+Addition+"\n"+"Subtraction: "+Subtraction+"\n"+"Multiplication: "+Multiplication+"\n"+"Division: "+Division);
		
		scan.close();
	}

}
