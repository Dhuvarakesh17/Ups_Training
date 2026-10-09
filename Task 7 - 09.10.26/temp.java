import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Temperature in Celcius: ");
        double celcius=scan.nextDouble();
        double kelvin=celcius+273.15;
        double fauhrenheit=(celcius*(9/5))+32;
        System.out.println("The Temperture Conversion of Celcius: "+celcius+" To Kelvin is "+kelvin);
        System.out.println("The Temperature Conversion of Celcius :"+celcius+" To Fauhrenheit is "+fauhrenheit);
        scan.close();
    }
    
}
