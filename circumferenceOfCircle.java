// Find the circumferenec of circle 
import java.util.Scanner;
public class circumferenceOfCircle {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        double circumference=2*(Math.PI)*r;
        System.out.println(circumference);
    }

}

