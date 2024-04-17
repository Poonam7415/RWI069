/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonip
 */
public class LinkedList {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
         list.add("ankit");  
         list.add("peter");  
         list.add("mayank");
         System.out.println(list);
         list.remove("ankit");
         System.out.println(list);
         list.set(1, "Shivesh");
         System.out.println(list);
    }
    
}
