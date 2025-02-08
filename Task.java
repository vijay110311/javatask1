class addition{
    
    addition(int a,int b){
        // this.a=a;
        // this.b=b;
      System.out.println("add:"+(a+b));  
    }

class calculator{
    void avg(int a, int b,int c){

        System.out.println(a+b+c/3);
    }
void avg(){
    System.out.println("hello");
}

}


public class Task {
    public static void main(String[] args) {
         addition a=new addition(10, 19);
        calculator c=new calculator();
        c.avg(12,23,45);

    }
}
