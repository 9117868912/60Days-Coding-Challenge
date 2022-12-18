// Product of two number usin function
import java.util.Scanner;
public class productFunction {
   public static int calculateProduct(int a, int b){
    int product=a*b;
    return product;
   } 
   public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int product=calculateProduct(a,b);
    System.out.println(product);

   }
}
