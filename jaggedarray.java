import java.util.*;
public class jaggedarray {
    int col;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //static int col; 
        System.out.print("enter the row values:");
        int row=s.nextInt();
       
      
        // bn b int[][] arr={{1,2,4},{2,2,3},{4,5}};
         int[][] arr=new int[row][];
        // for(int i=0;i<arr.length;i++){
            //     for(int j=0;j<arr[i].length;j++){
                //         System.out.print(arr[i][j]);
                //     }
                //     System.out.println();
              
                   
                    
                    
      
            for (int i = 0; i < arr.length; i++) {
                System.out.println("enter the each col "+(i+1)+" size");
                int col=s.nextInt();
                arr[i]=new int[col];
                for(int j=0;j<arr[i].length;j++){
                    System.out.print("enter the ["+i+" ] ["+j+"]:");
                    arr[i][j]=s.nextInt();
                }
                
            }
      
            for (int i = 0; i < arr.length; i++) {
                for(int j=0;j<arr[i].length;j++){
                    System.out.print("array["+i+" ] ["+j+"]:");
                    System.out.print(arr[i][j]);
                
                    
                }
                System.out.println();
                
            }

        
    }
}
