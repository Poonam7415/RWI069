/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops;

/**
 *
 * @author sonip
 */
//method overriding
public class Test1 {
    void show(){
        System.out.println("1"); 
    }
    
}
class Test2 extends Test1  {
    void show(){
        System.out.println("2");
        
    }
    public static void main(String[] args) {
        Test1 Tt = new Test1();
        Test2 tt = new Test2();
        tt.show();
        Tt.show();
        
    }
}
