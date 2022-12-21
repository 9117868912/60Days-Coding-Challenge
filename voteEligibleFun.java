
    //Write a function that takes in age as input and return if that person is eligible to vote or not .A person of age>18 is eligible to vote
import java.util.*;
public class voteEligibleFun {
    public static int voteForEligible(int age){
        if(age>=18){
            System.out.println("This person is Eligible to Vote");
        }else{
            System.out.println("This person is not Eligible to Vote");

        }
        return age;




    }
    public static void main(String agrs[]){
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        
        System.out.println(voteForEligible(age));

    }
    
}

