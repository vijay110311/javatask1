//Static key word use the method hiding 
//It is not override it is over hiding method 
class Animal{
    static void Sound(){
        System.out.println("Animal sound!");
    } 
}
class Dog extends Animal{
    static void Sound(){
      //  super.sound(); //we can't use the super key in method hiding
        System.out.println("dog barks!");
    }
    void eat(){
        System.out.println("Dog eats!");
    }
}
public class methodhiding {
public static void main(String[] args) {
    Dog d=new Dog();
    Dog.Sound();  //It can access the classname.method()name 
    d.eat(); // Normal method access the objname.method()name
}    
}
