import java.util.*;
public class arraytask9 {

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

        for(int b:a){
            c+=b;
        }
        System.out.println("total value:"+c);
        System.out.println("average value:"+c/a.length);

    }
}


