// Write a function which takes in 2 numbers and returns the greater of those two
import java.util.Scanner;
public class greaterNumFun {
    public static int greaterNumber(int a, int b){
        if(a>b){
            System.out.println(+a+"is a greater number of "+b);
        }
        else{
            System.out.println(+b+" is a greater number of "+a);
 
        }
        return 0 ;

    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt(); 
       
        System.out.println(greaterNumber( a,  b));

    }
    
}
