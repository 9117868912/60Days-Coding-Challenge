import java.util.Scanner;
public class addFunction {
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
    } 
    public static void main(String args[]){
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();
int sum=calculateSum(a,b);
System.out.println(sum);
    }
}
