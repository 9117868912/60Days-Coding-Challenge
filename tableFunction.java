// Make a function to print the table of a given number n
public class tableFunction {
    public static int table(int n){
        
        for(int i=1;i<=10;i++){
            int result=n*i;
            System.out.println(n+"*"+i+ "="+result);
    }
    return n;
}
    public static void main(String args[]){
System.out.println( table(7));

    }
    
}
