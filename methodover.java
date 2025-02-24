//use the super keyword and over ride the methods



class  Animal{
    void sound(){
        System.out.println("Animal sounds!");
    }
}
class Dog extends Animal{
   @Override
    void sound(){
        super.sound();
        System.out.println("Dog barks!");
    }
    void eat(){
        System.out.println("Dog eat bones!");
    }
}

public class methodover {
    public static void main(String[] args) {
         Dog d=new Dog();
         d.sound();
         d.eat();
    }
}
