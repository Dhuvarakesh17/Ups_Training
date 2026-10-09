import java.util.Scanner;
public class calc {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the side of the square");
        int n=scan.nextInt();
        int AreaSqu=n*n;
        System.out.println("Enter the Length for the Rectangle");
        int len=scan.nextInt();
        System.out.println("Enter the Breadth for the Rectangle");
        int bre=scan.nextInt();
        int AreaRec=len*bre;
        
        System.out.println("Area of the square is: "+AreaSqu);
        System.out.println("Area of the rectangle is: "+AreaRec);
        scan.close();   

    }
}
