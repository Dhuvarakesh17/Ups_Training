import java.util.Scanner;
public class ppattern {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();

        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(i==0 || j==0 || i==l/2 || (j==l-1 && i<=l/2)){
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
