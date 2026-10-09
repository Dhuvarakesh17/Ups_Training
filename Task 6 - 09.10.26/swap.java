import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the Value for A");
        int A=scan.nextInt();
        System.out.println("Enter the Value for B");
        int B=scan.nextInt();

        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("A: "+A+"\n"+"B: "+B);
    }
}
