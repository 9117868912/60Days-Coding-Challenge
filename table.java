// Print the table using for loop 

import java.util.Scanner;
public class table {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=10;i++){
            int table=n*i;
            System.out.println(n+"*"+i+ "="+table);
        }
    }
}
