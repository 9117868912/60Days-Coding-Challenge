import java.util.Scanner;

public class calculator {
    public static void main(String ars[]){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int operator=input.next().charAt(0);
        int result;
        switch(operator){
            case '+': result=a+b;
            System.out.println(result);
            break;
            case '-': result=a-b;
            System.out.println(result);
            break;
            case '*': result=a*b;
            System.out.println(result);
            break;
            case '/': result=a/b;
            System.out.println(result);
            break;
            case '%': result=a%b;
            System.out.println(result);
            break;
            default:
            System.out.println("invalid Operator");
        }
    }
}
