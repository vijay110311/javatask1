//multiple inheritance is problem accure in java becuse it cannot support 
//It make diamond problem and ambiquity
//It can achived using interface keyword and interface class oly create the method definition.


interface A{
    void a();
}
interface B{
    void b();
}
class C implements A,B{
    public void a(){
        System.out.println("class A");
    }
    public void b(){
        System.out.println("Class B");
    }
   void c(){
    System.out.println("Class C");
   }
}

public class multiplein {
    public static void main(String[] args) {
        C c=new C();
        c.a();
        c.b();
        c.c();
    }
}
