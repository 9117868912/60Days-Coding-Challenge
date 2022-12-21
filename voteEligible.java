//Write a program to takes in age as input and return if that person is eligible to vote or not .A person of age>18 is eligible to vote
import java.util.*;
public class voteEligible {
    public static void main(String agsr[]){
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        if(age>=18){
            System.out.println("This person is Eligible to Vote");
        }else{
            System.out.println("This person is not Eligible to Vote");

        }

    }
    
}
