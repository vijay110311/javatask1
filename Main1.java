//This program is create to the  area/perimeter of calculation and how to use the object value pass in main method to another class method access.
//I use the three class one class is main and another two is area /perimeter class.
//Main class create two object and call or access the another class method
//area class is used to three method/funtion square,rect,circle.
//perimeter class is used to  square,rect,circle method.
class area{
    double pi=3.14;
    int r;
    int a,l,b;
    
    void square(){
        System.out.println("Square value:"+(a*a));
    }
    void rect(){
        System.out.println("Reactangle:"+l*b);
    }
    void circle(){
        System.out.println("Circle:"+pi*r*r);
    }

}
class periarea{
    double pi=3.14;
    int r;
    int a,l,b;
    
    void square(){
        System.out.println("perimeter Square:"+(a*a*a*a));
    }
    void rect(){
        System.out.println("perimeter rectangle:"+2*l+b);
    }
    void circle(){
        System.out.println("perimeter circle:"+(2*pi)*r);
    }

}
public class Main1 {
public static void main(String[] args) {
    area a=new area();
    periarea p=new periarea();
    a.a=10;
    a.b=20;
    a.l=10;
    a.r=25;
    a.circle();
    a.square();;
    a.rect();
    p.a=10;
    p.b=10;
    p.l=10;
    p.r=20;
    p.circle();
    p.square();;
    p.rect();

}
    
}