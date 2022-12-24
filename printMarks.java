// Input by user print the Student marks
import java.util.Scanner;
public class printMarks {
   public static void main(String args[]){
    Scanner input=new Scanner(System.in);
int size=input.nextInt();

    int number[]=new int[size]; 
    for(int i=0;i<size;i++){
        number[i]=input.nextInt();
    }
    for(int i=0;i<size;i++){
        System.out.println(number[i]);
    }

   } 
}
