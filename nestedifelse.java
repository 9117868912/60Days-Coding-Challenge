import java.util.Scanner;
public class nestedifelse {
    public static void main(String args[]){
        int a, b , c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the Second Number is ");
        b=sc.nextInt();
        System.out.println("Enter the third number is ");
        c=sc.nextInt();

        // nested is part 
        if(a==b){
            System.out.println("a equal to b");
            if(b==c){
                System.out.println("b equal to c");
            }

        }
        else{
            System.out.println("Not equal ");
        }

    }
    
}
