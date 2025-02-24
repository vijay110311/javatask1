class A{
    void a(){
    System.out.println("class A");
    }
}
class B extends A{
    void b(){
        System.out.println("class B");
    }
}
class C extends B{
    void c(){
        System.out.println("class C");
    }
}
public class multilvlin {
    public static void main(String[] args) {
        C c=new C();
        c.a();
        c.b();
        c.c();    
    
    
    }
}
