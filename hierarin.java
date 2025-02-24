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
class C extends A{
    void c(){
        System.out.println("class c");
    }
}
public class hierarin {
    public static void main(String[] args) {
        B b=new B();
        b.a();
        b.b();
        C c=new C();
        c.a();
        c.c();

    }
    
}
