//this method used to encapsulation 
//It is used to private access  keyword 
//encapsulation is a process of hiding data and cannot change and modify values 

class Student{
    private int Age;
    private String Name;
    public void setAgename(String name,int age){
        Age=age;
        Name=name;
    }
    public int getage(){
        return Age;
    }
    public String getname(){
        return Name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student s=new Student();
        s.setAgename("vijay", 20);
        
        System.out.println(s.getage());
        System.out.println(s.getname());
 
    }
}
