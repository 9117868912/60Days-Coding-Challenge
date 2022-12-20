//Swap Two number using function
public class swapTwoNumber {
    public static void swapNumber(int a, int b){
       
        
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
         

    }

    public static void main(String args[]){
        int a=10;
        int b=20;
      swapNumber(a,b);

    }
    
}
