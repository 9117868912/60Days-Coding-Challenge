// Print the weeks name using switch statement 


import java.util.Scanner;
public class Printweeks {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        switch(n){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednessday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid input data");
        }


        }
}
