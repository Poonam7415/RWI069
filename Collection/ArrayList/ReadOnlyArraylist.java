/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection.ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sonip
 */
public class ReadOnlyArraylist {
    public static void main(String[] args) {
        List<String>Name = new ArrayList<String>();
        Name.add("Poonam");
        Name.add("Riya");
        Name.add("shiva");
        
        
    List<String>unmodifiableList= Collections.unmodifiableList(Name);
    unmodifiableList.add("Banana");
        System.out.println(Name);
    }
    
}
