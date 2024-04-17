/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author sonip
 */
public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> firstList=new ArrayList<String>(); 
        firstList.add("Rewa");
        firstList.add("Bhopal");
        firstList.add("Indore");
        firstList.add("Rajwada");
        System.out.println(firstList);
        
        ArrayList<String> SecondList=new ArrayList<String>(); 
        SecondList.add("Rewa");
        SecondList.add("Bhopal");
        SecondList.add("Indore");
        SecondList.add("Rajwada");
        System.out.println(SecondList);
        
        boolean compare = firstList.equals(SecondList);
        System.out.println(compare);
        SecondList.add("Ratlam");
        System.out.println();
    }
    
}
