
public class demo5{
  public static void main (String[] args){
    int a = 10, b = 20, c = 10;

    String result = (a == b && b == c)
        ? "All are same"
        : (a != b && b != c && a != c)
        ? "All are different"
        : "Two numbers are same";

System.out.println(result);
  }
}
