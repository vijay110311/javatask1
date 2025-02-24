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


public class singlein {
    public static void main(String[] args) {
        B b=new B();
        b.a();
        b.b();
    }
    
}
