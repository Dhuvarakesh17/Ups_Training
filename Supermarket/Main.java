package Supermarket;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

class Customer{
    String[] cat={"Fruits","Vegetables","Juice"};
    String[] fruits={"Apple","Banana","Guava"};
    String[] vege={"Carrot","Tomato","Onion"};
    String[] juice={"Strawberry Milkshake","Mango Juice","Chocolate Milkshake"};
    int[] fp={50,60,70};
    int[] vp={35,55,65};
    int[] jp={20,50,70};
    int tot=0;
    int[][] quantity={{0,0,0},{0,0,0},{0,0,0}};
    void getMenu(){
        System.out.println("Categories");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+". "+cat[i]+":");
            if(i==0){
                for(int j=0;j<3;j++){
                    System.out.println(" "+(j+1)+". "+fruits[j]+": $"+fp[j]);
                }
            }
            else if(i==1){
                for(int j=0;j<3;j++){
                    System.out.println(" "+(j+1)+". "+vege[j]+": $"+vp[j]);
                }
            }
            else{
                for(int j=0;j<3;j++){
                    System.out.println(" "+(j+1)+". "+juice[j]+": $"+jp[j]);
                }
            }

        }

    }
    void getFruits(){
        System.out.println("Fruits and Prices");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+". "+fruits[i]+": $"+fp[i]);
        }
    }
    String getFruit(int i){
        return fruits[i-1];
    }

    void getVeges(){
        System.out.println("Vegetables and Prices");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+". "+vege[i]+": $"+vp[i]);
        }
    }
    String getVege(int i){
        return vege[i-1];
    }
    void getJuices(){
        System.out.println("Juices and Prices");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+". "+juice[i]+": $"+jp[i]);
        }
    }
    String getJuice(int i){
        return juice[i-1];
    }
    void setQuantity(int i,int j,int k){
        quantity[i-1][j-1]+=k;
    }
    void getTotal(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==0){
                    tot+=quantity[i][j]*fp[j];
                }
                else if(i==1){
                    tot+=quantity[i][j]*vp[j];
                }
                else{
                    tot+=quantity[i][j]*jp[j];
                }
            }
        }
        System.out.println("Total is $"+tot);
    }
    void printBill() throws IOException{
        try(PrintWriter writer=new PrintWriter(new FileWriter("bill.txt",true))){
            writer.println("Bill");
            writer.println("Fruits:");
            for(int i=0;i<3;i++){   
                if(quantity[0][i]>0){
                    writer.println(fruits[i]+" x "+quantity[0][i]+" = $"+(quantity[0][i]*fp[i]));
                }
            }
            writer.println("Vegetables:");
            for(int i=0;i<3;i++){   
                if(quantity[1][i]>0){
                    writer.println(vege[i]+" x "+quantity[1][i]+" = $"+(quantity[1][i]*vp[i]));
                }
            }
            writer.println("Juices:");
            for(int i=0;i<3;i++){   
                if(quantity[2][i]>0){
                    writer.println(juice[i]+" x "+quantity[2][i]+" = $"+(quantity[2][i]*jp[i]));
                }
            }   
    
            new ProcessBuilder("notepad.exe","bill.txt").start();
            writer.println("Total is $"+tot);

        }
    }
    
}

public class Main {
    public static void main(String[] args) throws IOException{
        Customer c1=new Customer();
        System.out.println("SuperMarket:");
        while(true){
            System.out.println("1. View Categories");
            System.out.println("2. Add items");
            System.out.println("3. View total");
            System.out.println("4. Exit");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    c1.getMenu();
                    break;
                case 2:
                    System.out.println("Select Category");
                    int catChoice=sc.nextInt();
                    switch(catChoice){
                        case 1:
                            c1.getFruits();
                            System.out.println("Select Fruit to Add (1-3):");
                            int fruitChoice=sc.nextInt();
                            System.out.println("Enter Quantity:");
                            int quantity1=sc.nextInt();
                            c1.setQuantity(1, fruitChoice, quantity1);
                            System.out.println(quantity1+" "+c1.getFruit(fruitChoice)+" added to cart.");
                            break;
                        case 2:
                            c1.getVeges();
                            System.out.println("Select Vegetables to Add (1-3):");
                            int vegeChoice=sc.nextInt();
                            System.out.println("Enter Quantity:");
                            int quantity2=sc.nextInt();
                            c1.setQuantity(2, vegeChoice, quantity2);
                            System.out.println(quantity2+" "+c1.getVege(vegeChoice)+" added to cart.");
                            break;
                        case 3:
                            c1.getJuices();
                            System.out.println("Select Juice to Add (1-3):");
                            int juiceChoice=sc.nextInt();
                            System.out.println("Enter Quantity:");
                            int quantity3=sc.nextInt();
                            c1.setQuantity(3, juiceChoice, quantity3);
                            System.out.println(quantity3+" "+c1.getJuice(juiceChoice)+" added to cart.");
                            break;
                        default:
                            System.out.println("Invalid Category Choice");
                    }
                    break;
                case 3:
                    c1.getTotal();
                    c1.printBill();
                    break;
                case 4:
                    System.out.println("You have Exited the SuperMarket.");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
                    break;
            }

    }
}
}
