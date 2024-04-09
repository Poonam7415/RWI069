package Interface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonip
 */
public interface vehicle {
    void changeGear();
    void changeSpeed();
    
} 
class car implements vehicle{
    public void changeGear(){
        System.out.println("Change the gear");
        
    }
    public void changeSpeed(){
        System.out.println("Change speed");
}
    
}
class Bike implements vehicle{
    public void changeGear(){
        System.out.println("Change the gear");
        
    }
    public void changeSpeed(){
        System.out.println("Change speed");
}
    public static void main(String[] args) {
      Bike b = new Bike();
      b.changeGear();
      b.changeSpeed();
      car c = new car();
      c.changeGear();
      c.changeSpeed();
    }
}


