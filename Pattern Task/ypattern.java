import java.util.Scanner;
public class ypattern {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();

        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if ((i==j&&i<=l/2) || j==l-i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            scan.close();
        }
    }
}
