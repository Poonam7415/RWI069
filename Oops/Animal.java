/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops;

/**
 *
 * @author sonip
 */
public class Animal {
     public void sound(){
             System.out.println("the dog is bark");
         }
         public static void main(String[] args) {
             System.out.println("1");
             Animal Aa = new Animal();
             Bird Bb = new Bird();
            
            Bb.fly();
             Aa.sound();
         }
         }

class Bird
{
    void fly(){
             
        System.out.println("bird is fly");
     }
}
     
    
