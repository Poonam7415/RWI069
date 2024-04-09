package Oops;

public class Teacher {
    void show(){
        System.out.println("this is teacher");
    }
    
}
class Student3 extends Teacher{
        void show(){
            System.out.println("this is Student");
        }
        public static void main(String[] args) {
        Teacher t = new Teacher();
        Student3 S = new Student3();
        t.show();
        S.show();
    }
}
