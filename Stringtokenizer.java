import java.util.*;
public class Stringtokenizer {
    public static void main(String[] args) {
       //countTokens() -> This method return the totral no of tokend present
        StringTokenizer st=new StringTokenizer("hello world");
        int a=st.countTokens();
        System.out.println(a);

        //hasMoreTokens() ->This meethod return yrue or false value 
        //ex: hello world -> hello is a token and next world is a token it return the true, but world is token but,next value is false there is (noword)
        boolean hmt=st.hasMoreTokens();
        System.out.println(hmt);

        //nextToken() ->This method is used to return the next token,it return string value
        String nt=st.nextToken();
        System.out.println(nt);

        //hasMoreElemnt() -> It is similar to hasMoreTokens() method,it return boolean value
        boolean hme=st.hasMoreElements();
        System.out.println(hme);

        //nextElement() ->  It is similar nextTokens() method,it return object value
        String ne =(String) st.nextElement();
        System.out.println(ne);



        //ex prg
        StringTokenizer s=new StringTokenizer("hello world  java");
        int n=s.countTokens();
        for(int i=0;i<n;i++){
            System.out.println(s.nextToken());
            //System.out.println(s.nextElement());
        }

        //hasmoretoken prg
        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
    }

} 
