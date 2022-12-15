// Print the binary Pattern
// 10101
// 01010
// 10101
// 01010
// 10101

import java.util.Scanner;
public class BinaryNumber
{
      
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
          
                 
        int n = input.nextInt();
          
        for (int i = 1; i <= n; i++) 
        {
            int num;
              
            if(i%2 == 0)
            {
                num = 0;
                  
                for (int j = 1; j <=n; j++)
                {
                    System.out.print(num);
                      
                    num = (num == 0)? 1 : 0;
                }
            }
            else
            {
                num = 1;
                  
                for (int j = 1; j <=n; j++)
                {
                    System.out.print(num);
                      
                    num = (num == 0)? 1 : 0;
                }
            }
              
            System.out.println();
        }
        
    }
}            
    

