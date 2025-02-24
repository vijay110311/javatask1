
class parent{
    void show(){
        System.out.println("parent class");
    }
}
class child extends parent{
    void show(){
        super.show(); //we use super class in dynmethodispatch
    System.out.println("child class");
    }
}

public class Dynmethoddis {
    public static void main(String[] args) {
        parent obj=new child(); //parent reference,child object
        obj.show();
    }
}
