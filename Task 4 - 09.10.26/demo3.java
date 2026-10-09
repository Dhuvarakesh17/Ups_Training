
import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		String Name =scan.next();
		
		System.out.println("Enter your age:");
		int age=scan.nextInt();
		
		System.out.println("Enter your Mobile Number:");
		long mobile=scan.nextLong();
		
		System.out.println("Enter your native location:");
		String location=scan.next();
		
		System.out.println("Enter your Email");
		String email=scan.next();
		
		System.out.println("Name: "+Name+"\n"+"Age: "+age+"\n"+"Mobile Number: "+mobile+"\n"+"Location: "+location+"\n"+"Email: "+email);
		
		scan.close();
		
	}

}
