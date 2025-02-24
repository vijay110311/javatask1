//Abstraction is process of hiding implementation details and Showing only tyhe essential features of an object
//Abstract is a concrete method
//It is can be achived  using  abstract classes and interface
//It improves code maintability and reduces complexity 



abstract class Animal{
    abstract void sound();
    abstract void eat();
    void sound1(){
        System.out.println("Animal Sound!");
    }

} 
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks!");
    }
    void eat(){
        System.out.println("Dog eat bones!");
    }
} 
public class Abstract {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound1();
        d.eat();
        d.sound();
    }
}
