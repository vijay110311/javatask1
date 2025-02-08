import java.util.*;
//import java.io.PrintStream;
public class Arraymethod {
    public static void main(String[] args) {
        int[] a={40,20,39,27,21};
        //toString()
        System.out.println("tostring method:");
        System.out.println(Arrays.toString(a));
        //sort()
        Arrays.sort(a);
        System.out.println("sort method:");
        for(int n:a){
            System.out.println(n);
        }
        //fill()
        Arrays.fill(a, 5);
        System.out.println("fill method:");
        for(int n:a){
            
            System.out.println(n);
        }
        //copyOf()
        int[] b=Arrays.copyOf(a, 8);
        System.out.println("copyof method:");
        for(int n:b){
            
            System.out.println(n);
        }
        //clone()
        int[] c=a.clone();
        System.out.println("clone method:");
        for(int n:c){
            
            System.out.println(n);
        }
        //copyOfRange()
        int[] d=Arrays.copyOfRange(a, 1, 3);
        System.out.println("copyofrange method:");
        for(int n:d){
            
            System.out.println(n);
        }
        
        //equals()
        int[] c2={10,20,39,30};
        int[] c3={10,20,30,30};
        System.out.println("equals method:");
        System.out.println( Arrays.equals(c2, c3));
        
        //binarysearch()
        System.out.println("binarysearch method:");
        System.out.println(Arrays.binarySearch(c2, 00));
        
    }
}
