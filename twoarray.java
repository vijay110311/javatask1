import java.util.*;
public class twoarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the row no:");
        int row=s.nextInt();
        System.out.println("enter the cloumn no:");
        int col=s.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println("enter the["+i+"] ["+j+"]");
                arr[i][j]=s.nextInt();

            }
        }
        for(int[] a:arr){
            for(int ele:a){

                System.out.print(" "+ele);

            }
            System.out.println();
        }
    }
}
