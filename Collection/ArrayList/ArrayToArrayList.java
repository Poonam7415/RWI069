/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sonip
 */
public class ArrayToArrayList {
    public static void main(String[] args) {
           List<String> fruitList = new ArrayList<>();  
        //adding String Objects to fruitsList ArrayList  
        fruitList.add("Mango");  
        fruitList.add("Banana");  
        fruitList.add("Apple");  
        fruitList.add("Strawberry");  
        fruitList.add("Pineapple");  
        System.out.println("Converting ArrayList to Array" );  
           String[] item = fruitList.toArray(new String[fruitList.size()]);  
            for(String s : item){  
            System.out.println(s);  
                System.out.println("Converting Array To ArrayList");
                 List<String>l2 = new ArrayList<>(); 
                 l2 = Arrays.asList(item);
                 System.out.println(l2);
        }  
    }
}
