
// calculate the average marks from an array 
import java.util.Scanner;
public class aveInputUserarr {
    
    public static void  main(String args[]){
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int sum=0;
        int marks[]=new int[size];
        for(int i=0;i<size;i++){
            marks[i]=input.nextInt();
            }
            for(int i:marks){
               sum=sum+i;
               }
               System.out.println("The average value of marks is:" +sum/marks.length);

    }
    
}