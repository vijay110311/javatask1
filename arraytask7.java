import java.util.*;
public class arraytask7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter length of array values:");
        int c=s.nextInt();
        int[] a=new int[c];
     for(int j=0;j<a.length;j++){
        System.out.println("enter your value:"+j);
            int b=s.nextInt();
            a[j]=b;
     }   
     
        for(int i=0;i<a.length;i++){
            System.out.println("array:"+i+":"+a[i]);
        }
        System.out.println("array value:"+c);
    }
}

