import java.util.*;
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();

        //1.append()
         System.out.println(s.append("java"));
         
        //2.reverse()
        StringBuilder a1=s.reverse();
        System.out.println(a1);
        StringBuilder a=s.append("java");
        String v=a.toString();
        System.out.println(v);

        //3.insert()
        StringBuilder b=s.insert(1,"java");
        System.out.println(b);

        //4.replace()
        StringBuilder c= s.replace(1, 2,"java" );

        //String d=c.toString();
        System.out.println(c);

        //5.delete()
        StringBuilder d=s.delete(1,4);

       // String d1=d.toString();
       System.out.println(d);

       //6.capacity()
       int e=s.capacity();
       System.out.println(e);

       //7.ensure capacity
       //8.ensureCapacity(50); omly used stringbuilder calss
       //9.substring two method (index),(start index,end index)
       String g=s.substring(1);
        System.out.println(g);
         





    }
}
