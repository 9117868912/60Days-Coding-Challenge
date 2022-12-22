// Make a function to check if a given numbe rn is even or not 
public class func_check_Even {
    public static int  Even(int n){
        if(n%2==0){
                     System.out.println("This number is Event:" +n);
        }
        else{
               System.out.println("This number is not  Event:" +n);
        }
        return n;
    }
    public static void main(String args[]){
        System.out.println(Even(6));

    }
}
