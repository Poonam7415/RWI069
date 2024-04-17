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
import java.util.ListIterator;
public class Loop {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ram");
        al.add("Shyam");
        al.add("heema");
        al.add("hina");
        al.add("ishan");
        System.out.println("List iterator");
        ListIterator<String> list = al.listIterator();
        while(list.hasPrevious()){
            String str = list.previous();
            System.out.println(str);
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
            
        }
        System.out.println("--------------------------");
        System.out.println("List through for each remaining method");
        Iterator<String> itr = al.iterator();
        itr.forEachRemaining(a->{
        System.out.println(a);
        
        });
        System.out.println("-----------------------------");
        System.out.println("List through for each loop");
        
                }
    }
    
 

