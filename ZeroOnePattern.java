//Print the Zero One Pattern
// 1
// 10 
// 101
// 1010
// 10101
import java.util.Scanner;
 public class ZeroOnePattern
{            
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
          
        
          
        int rows = input.nextInt();         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
              
            System.out.println();
        }
          
    }
}
    

