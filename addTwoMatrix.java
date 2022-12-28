// Write a java program to add two matrix of size 3*3
public class addTwoMatrix {
    public static void main(String args[]){
        int mat1[][]={ {3, 5 ,6},
                       {3, 5 ,6},
                       {3, 5 ,6}};
        int mat2[][]={ {1, 5 ,4},
                       {3, 4 ,2},
                       {6, 1 ,7}};
        int result[][]={ {0, 0 ,0},
                         {0, 0 ,0},
                         {0, 0 ,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1.length;j++){
                
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }               

    }
    
}
