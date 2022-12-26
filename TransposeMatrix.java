//TAke a matrix as input from the user
//  For a given matrix of N*M print  its transpose 
import java.util.Scanner;
public class TransposeMatrix {
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
        System.out.println("The transpose is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();
        }

    }
    
}
