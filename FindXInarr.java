//Take an array as input from the user search for given number xand print the index at which it occur

import java.util.Scanner; 
public class FindXInarr {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=input.nextInt();
        }
        int x=input.nextInt();
        for(int i=0;i<number.length;i++){
            if(number[i]==x){
                System.out.println(x+"number is given in the array");
            }
            else{
                System.out.println(x+"number is not given in the array");
            }
        }


    }
    
}
