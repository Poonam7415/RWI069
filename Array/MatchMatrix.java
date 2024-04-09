/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author sonip
 */
public class MatchMatrix {

    public static void main(String[] args) {
        int a[][] = {{4, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = {{1, 2, 1}, {4, 3, 5}, {7, 8, 1}};
        boolean isMatch = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                isMatch = a[i][j] == b[i][j];
                if(isMatch==false){
                  break;
                }
              
            }

        }
            
          System.out.println(isMatch);

    }

}
