//java does not support multiple inherit so we can't use the hybrid inherit
 
 
 
 class A  {
void displayA(){
    System.out.println("class a");
}
}
class B extends A{
    void displayB(){
        System.out.println("Class B");
    }
}
interface C{
    void displayC();
}
interface D{
    void displayD();
}
class E extends B implements C,D{
    public void displayC(){
        System.out.println("interface C");
    }
    public void displayD(){
        System.out.println("interface D");
    }
}


public class hybrid extends B {
    public static void main(String[] args) {
        
        hybrid h=new hybrid();
        
        h.displayA();
        E e=new E();
        e.displayB();
        e.displayA();
        e.displayC();
        e.displayD();
    }
}
