//Encapsulation
package Oops;

public class Student1 {

    int id, age;
    String Name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public static void main(String[] args) {
        Student1 student = new Student1();
        student.setId(1);
        student.setAge(12);
        student.setName("Ram");
        System.out.println("Id" + "-" + student.getId());
        System.out.println("Age" + "-" + student.getAge());
        System.out.println("Name" + "-" + student.getName());

    }
}


