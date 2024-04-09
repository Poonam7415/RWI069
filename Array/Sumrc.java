/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author sonip
 */
public class Sumrc {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rowsum;
        int colsum;
        for (int i = 0; i < 3; i++) {
            rowsum = 0;
            colsum = 0;
            for (int j = 0; j < 3; j++) {
                colsum += a[j][i];
                rowsum += a[i][j];

            }
            System.out.println("col" + "-" + colsum);
            System.out.print("row" + "-" + rowsum);
        }

    }
}
