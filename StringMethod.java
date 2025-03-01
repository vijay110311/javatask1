//this is a string method program
//string is a immutable method 
public class StringMethod {

    public static void main(String[] args) {
        String s="Hello world";
        //charAt() -> return the character at the specific index value
        char a=s.charAt(0);
        System.out.println(a);

        //concat() ->Appends a string to the end of another string
        String s1="java";
        String s2="java";
        String s3=s.concat(s1);
        System.out.println(s3);

        //toUpperCase()-> convert to a string letter to lowercase letter
        System.out.println(s1.toUpperCase());

        //toLowerCase()-> convert to string letter to uppercase letter
        System.out.println(s3.toLowerCase());

        //trim()-> removes white space from both ends of a string
        System.out.println(s.trim());

        //length()-> return the length of a value
        System.out.println(s.length());

        //stratsWith()->checks whether a string starts with specified character
        System.out.println(s1.startsWith("java"));

        //replaceAll() ->replace each substring of the this string  
        System.out.println(s1.replaceAll("j","m"));

        //lastIndexOf() ->return the position of the last found occurance of specified character in a string
        System.out.println(s1.lastIndexOf("java"));

        //toCharArray() ->convert to a new arrays character
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        System.out.println(ch);

        //equals() ->equlas an object values
        System.out.println(s1.equals(s2));

    }
}