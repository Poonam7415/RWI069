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
public class GetSetArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("ram");
        al.add("shyam");
        al.add("sita");
        al.add("Gita");
        al.add("Mohan");
        System.out.println("Returning Element" + al.get(1));
        al.set(1, "siya");
        for(String Name:al)
            System.out.println(Name);
    }
    
}
