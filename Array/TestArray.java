package Array;

public class TestArray {
    public static void main(String[] args) {
        int a[] = {33,3,4,5};
       
        System.out.println("Printing original array");
        for(int i : a)
        
            System.out.println(i);
        
        System.out.println("Printing clone of the array");   
         int c[] = a.clone();
         for(int i : c)
             System.out.println(i);
         
        System.out.println("Are both equal");
        System.out.println(a==c);
             
        
        
        }
    }
  

