import java.util.*;
//import java.io.PrintStream;
public class Arraymethod {
    public static void main(String[] args) {
        int[] a={40,20,39,27,21};
        //toString() ->It is used to covert an array into readble String formate
        System.out.println("tostring method:");
        System.out.println(Arrays.toString(a));
        //sort() ->Sorting an array and assendind order convert
        Arrays.sort(a);
        System.out.println("sort method:");
        for(int n:a){
            System.out.println(n);
        }
        //fill() ->fill all element with the given values
        Arrays.fill(a, 5);
        System.out.println("fill method:");
        for(int n:a){
            
            System.out.println(n);
        }
        //copyOf() ->create a copy of an array with the new length
        int[] b=Arrays.copyOf(a, 8);
        System.out.println("copyof method:");
        for(int n:b){
            
            System.out.println(n);
        }
        //clone() -> Duplecate an array create new duplecate array
        int[] c=a.clone();
        System.out.println("clone method:");
        for(int n:c){
            
            System.out.println(n);
        }
        //copyOfRange() ->Copy elemant ia a specific range from an array
        int[] d=Arrays.copyOfRange(a, 1, 3);
        System.out.println("copyofrange method:");
        for(int n:d){
            
            System.out.println(n);
        }
        
        //equals() ->compare to arrays and return boolean values
        int[] c2={10,20,39,30};
        int[] c3={10,20,30,30};
        System.out.println("equals method:");
        System.out.println( Arrays.equals(c2, c3)); //false
        
        //binarysearch() -> Search as for an element using binarysearch. 
        //value should be is true  return ,not is return error or -1 value.
        System.out.println("binarysearch method:");
        System.out.println(Arrays.binarySearch(c2, 00)); //-1
        
    }
}
