
// Find the Volume of Cone
import java.util.Scanner;
public class volumeOfCone {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Eneter the radius of cone :");
        double r=input.nextDouble();
        System.out.println("Enter the Height of cone :");
        double h=input.nextDouble();
        double volume=(22*r*r*h)/(3*7);
        System.out.println("Volume of the Cone is :"+volume);
    }
    
}
