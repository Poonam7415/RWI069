/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator; 

/**
 *
 * @author sonip
 */
//SortJavaArrayList
public class SmartPhone {
     String brand;  
    String model;  
    int price;  
    int rating;  

    public SmartPhone(String brand, String model, int price, int rating) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "SortJavaArrayList{" + "brand=" + brand + ", model=" + model + ", price=" + price + ", rating=" + rating + '}';
    }
    

    public static void main(String[] args) {
         List<SmartPhone> phoneList = new ArrayList<>();  
        SmartPhone ph1 = new SmartPhone("Apple", "6s", 50000, 10);  
        SmartPhone ph2 = new SmartPhone("lg", "pro2", 40000, 9);  
        SmartPhone ph3 = new SmartPhone("MI", "3s", 10000, 6);  
        SmartPhone ph4 = new SmartPhone("Letv", "le2", 12000, 7);  

         phoneList.add(ph1);  
        phoneList.add(ph2);  
        phoneList.add(ph3);  
        phoneList.add(ph4);  
        
        System.out.println(phoneList);
        
        System.out.println("Sorting the list as a comparator");
        Collections.sort(phoneList,  new RatingComparator());
        System.out.println(phoneList);
        
        
        System.out.println(phoneList);  
        System.out.println("Reversing the Comparator sorting");  
        Comparator<SmartPhone> cmp = Collections.reverseOrder(new RatingComparator());  
  
        Collections.sort(phoneList, cmp);  
        System.out.println("Printing the reverse list");  
        System.out.println(phoneList);  
    }
    
}
