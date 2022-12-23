// Write a function that takes in the radius as input and return the circumference of a circle 
import java.util.Scanner;

public class circumferenceOfCircleFun{
    public static double circumferCircle(int r){
         double circumference=2*(Math.PI)*r;
          return circumference;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        System.out.println(circumferCircle( r));
    }

}