// Take a matrix as input from the user 
// Search for a f=given number X and print the index at which it occurs
import java.util.Scanner;
public class ArrXSearch {
    


    public static void  main(String args[]){
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        int col=input.nextInt();
        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        int x=input.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==x){
System.out.print("x found at location("+i+","+j+")");

            }
        
        }

    }
    
}
}