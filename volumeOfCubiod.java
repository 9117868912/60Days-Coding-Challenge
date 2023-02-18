
// Find the Volume of Cubiod
import java.util.Scanner;

public class volumeOfCubiod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eneter the length :");
        double l = input.nextDouble();
        System.out.println("Eneter the breadth of Cubiod :");
        double b = input.nextDouble();
        System.out.println("enter the height :");
        double h = input.nextDouble();
        double volume = l * h * b;
        System.out.println("Volume of Cubiod is :" + volume);
    }
}
