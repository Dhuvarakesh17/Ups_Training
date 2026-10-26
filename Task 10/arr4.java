import java.util.Scanner;

public class arr4 {
    public static boolean isprime(int n){
        boolean isPrime = n > 1;

        for (int i = 2; i * i <= n && isPrime; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the lenth of the array:");
        int length=scan.nextInt();
        int countPrime=0;
        int countodd=0;
        int counteven=0;
        int positivecount=0;
        int negativecount=0;

        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=scan.nextInt();
            if(isprime(arr[i])){
                countPrime++;
            }
            if (arr[i]%2!=0){
                countodd++;
            }else{
                counteven++;
            }
            if(arr[i]>0){
                positivecount++;
            }
            else{
                negativecount++;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        scan.close();
        System.out.println("\nCount of prime numbers: "+countPrime);
        System.out.println("Count of odd numbers: "+countodd);      
        System.out.println("Count of even numbers: "+counteven);
        System.out.println("Count of positive numbers: "+positivecount);
        System.out.println("Count of negative numbers: "+negativecount);
    }    
}
