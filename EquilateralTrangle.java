
// find area of Equilateral Trangle
import java.util.Scanner;

public class EquilateralTrangle {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of the Equilateral Triangle:");
        double a = s.nextDouble();
        double area = (Math.sqrt(3) / 4) * (a * a);
        System.out.println("Area of Equilateral Triangle is: " + area);
    }
}