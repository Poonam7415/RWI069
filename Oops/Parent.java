/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops;

/**
 *
 * @author sonip
 */
public class Parent {
    class vehicle{
        void show(){
            System.out.println("this is vehicle");
        }
        
    }
    class car extends vehicle{
        void display(){
            System.out.println("this is car");
        }
    }
    class bike extends vehicle{
        void display(){
            System.out.println("this is bike");
        }
    }
    public static void main(String[] args) {
    
    }
}
