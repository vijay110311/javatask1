import java.util.*;
public class threedarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the table value:");
        int tab=s.nextInt();
        System.out.println("enter the row value:");
        int row=s.nextInt();
        System.out.println("enter the column value:");
        int col=s.nextInt();
        int[][][] arr=new int[tab][row][col];
        int sum=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){

                    System.out.println("enter the ["+i+"] ["+j+"] [" +k +"] :" );
                    arr[i][j][k]=s.nextInt();
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("table no:"+i);
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){

                 System.out.println("array of ["+i+"] ["+j+"]["+k+"] :"+arr[i][j][k] );
                   
                }
                System.out.println();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){

                 sum+=arr[i][j][k];
                   
                }
                
            }
        }
        System.out.println(sum);
        String a=Arrays.deepToString(arr);
       System.out.println(a);
    }

}
