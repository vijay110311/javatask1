//this is a string method program
//string is a immutable method 
public class StringMethod {

    public static void main(String[] args) {
        String s="Hello world";
        //charAt()
        char a=s.charAt(0);
        System.out.println(a);
        //concat()
        String s1="java";
        String s2="java";
        
        String s3=s.concat(s1);
        System.out.println(s3);
        //toUpperCase()
        System.out.println(s1.toUpperCase());
        //toLowerCase()
        System.out.println(s3.toLowerCase());
        //trim()
        System.out.println(s.trim());
        //length()
        System.out.println(s.length());
        //stratsWith()
        System.out.println(s1.startsWith("java"));
        //replaceAll()
        System.out.println(s1.replaceAll("j","m"));
        //lastIndexOf()
        System.out.println(s1.lastIndexOf("java"));
        //toCharArray()
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        System.out.println(ch);
        //equals()
        System.out.println(s1.equals(s2));

    }
}