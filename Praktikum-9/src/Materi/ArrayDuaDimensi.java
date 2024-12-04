/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi;

/**
 *
 * @author HP
 */
public class ArrayDuaDimensi {
    public static void main(String[] args) {
        int[][] nilai =  {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }
}
