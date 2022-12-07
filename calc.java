import java.util.Scanner;

public class calc {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int operator=input.next().charAt(0);
        int result;
        if(operator=='+'){
            result=x+y;
            System.out.println(result);
        }
        else if(operator=='-'){
            result=x-y;
            System.out.println(result);
        }
        else if(operator=='*'){
            result=x*y;
            System.out.println(result);
        }
        else if(operator=='/'){
            result=x/y;
            System.out.println(result);
        }
        else if(operator=='%'){
            result=x%y;
            System.out.println(result);
        }
        else{
            System.out.println("Invalid data");
        }

    }
    
}
