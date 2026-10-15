import java.util.Scanner;
public class npattern {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        int l=scan.nextInt();
        for (int i=0;i<l;i++){
            for (int j=0;j<l;j++){
                if( j==0|| j==l-1 ||i==j){
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
