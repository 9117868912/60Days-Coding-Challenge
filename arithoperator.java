import  java.util.Scanner;

public class arithoperator {
    public static void main(String[]args){
        int a,b,sum,sub,mul,div,mod;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first Number is=");
          a=obj.nextInt();
          System.out.println("Enter the Second number is =");
          b=obj.nextInt();
          sum=a+b;
          System.out.println("sum of two number is  = "+sum);
          sub=a-b;
          System.out.println("Subtraction  of two number is  = "+sub);
          mul=a*b;
          System.out.println("Multiplication  of two number is  = "+mul);
          div=a/b;
          System.out.println("Division  of two number is  = "+div);
          mod=a%b;
          System.out.println("Modulus  of two number is  = "+mod);

    }
    
}
