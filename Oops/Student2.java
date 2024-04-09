//constructor
package Oops;

public class Student2 {
   int id,age;
   String Name;

    public Student2(int id, int age, String Name) {
        this.id = id;
        this.age = age;
        this.Name = Name;
    }
           void display(){
               System.out.println(id + "" + "," + age + "" + ","+ Name + "");
           }
    public static void main(String[] args) {
        Student2 ss = new Student2(1, 15, "RAM");
        ss.display();
    }
}


