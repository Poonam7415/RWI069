/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author sonip
 */
public class Matrix2 {
    public static void main(String[] args) {
        int a[][] = {{4, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = {{0, 4, 1}, {2, 3, 3}, {4, 2, 6}};
        int Multiply[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Multiply[i][j] = a[i][j]*b[i][j];
                System.out.print(Multiply[i][j] + " ");

            }
            System.out.println();

        }
 
    }
    
}
