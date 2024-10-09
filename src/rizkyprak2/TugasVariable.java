/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rizkyprak2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TugasVariable {
    public static void main(String[] args) {
        int total;
        Scanner hitung = new Scanner(System.in);
        
        System.out.print("Masukan Nilai 1 : ");
        int nilai1 = hitung.nextInt();
        System.out.print("Masukan Nilai 2: ");
        int nilai2 = hitung.nextInt();
        System.out.print("Masukan Nilai 3 : ");
        int nilai3 = hitung.nextInt();
        
        total = (nilai1 + nilai2 + nilai3)/3;
        System.out.println("Rata - rata nilai adalah " + total);
        
        
    }
}
