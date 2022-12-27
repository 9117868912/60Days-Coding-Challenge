// Create an array of 5 float and calculate their sum
public class addTotalMarks {
    public static void main(String[] args) {
        float marks[]={55.6f,67.8f,76.0f,34.5f,89.67f};
        float sum=0;
        for(float i:marks){
            sum=sum+i;
        }
        System.out.println("The value of Sum is :"+sum);
        
    }
    
}
