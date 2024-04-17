/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection.ArrayList;

/**
 *
 * @author sonip
 */
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<String>(); 
        list.add("Ravi");
        list.add("vijay");
        list.add("Ravi");
        list.add("Vijay");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(list);
    }
    
}
