// Print the left Pascal's triangle Patten
//     *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *

import java.util.Scanner;
public class leftPascal
{
 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
 
        int n = input.nextInt();        
        for (int i= 1; i<= n ; i++)
        {
            for (int j=i; j <n ;j++)            
        {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++) {
                 System.out.print("*");
                 }
                  System.out.println("");
                 } 
                 for (int i=n; i>=1; i--){
            for(int j=i; j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<i ;k++) 
            {
                System.out.print("*");
            }
            System.out.println("");
 
        }

    }
}
