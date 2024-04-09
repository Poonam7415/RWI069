package Oops;

//Abstract class
abstract class Student {
    
    abstract void start();
    
}
class Ram extends Student{
    void start(){
        System.out.println("ram is a student");
    }
}
    class siya extends Student{
        void start(){
            System.out.println("siya is a student");
        }
    
    
    public static void main(String[] args) {
     Ram r = new Ram();
     r.start();
     siya s = new siya();
     s.start();
     
    }    
}

