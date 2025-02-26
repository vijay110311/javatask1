//full abstraction
interface area{
    double pi=3.14;
    void circle(int r);
}
class areaofcircle implements area{
    public void circle(int r){
        System.out.println("area of circle:"+pi*r*r);
    }
}

public class Interface {
    public static void main(String[] args) {
        areaofcircle ac=new areaofcircle();
        ac.circle(6);
    }
}
