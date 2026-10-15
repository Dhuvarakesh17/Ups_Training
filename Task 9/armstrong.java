import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n;
        long sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n/=10;
        }
        System.out.println(sum==temp);
    }
    
}
