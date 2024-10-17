/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorjava;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TugasOperator3 {
    public static void main(String[] args) {
        int bilangan1,bilangan2,hasilPenjumlahan,hasilPengurangan,hasilPerkalian,hasilPembagian;
        Scanner hitung = new Scanner(System.in);
        
        System.out.println("Masukan Bilangan yang ingin dihitung ");
        System.out.print("Bilangan 1 :");
        bilangan1 = hitung.nextInt();
        System.out.print("Bilangan 2 :");
        bilangan2 = hitung.nextInt();
        hasilPenjumlahan = bilangan1 + bilangan2;
        hasilPengurangan = bilangan1 - bilangan2;
        hasilPerkalian = bilangan1 * bilangan2;
        
        System.out.println("Hasil Penjumlahan : " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan : " + hasilPengurangan);
        System.out.println("Hasil Perkalian : " + hasilPerkalian);
        System.out.println("Hasil Penjumlahan : " + hasilPenjumlahan);
        if(bilangan2 != 0) {
            hasilPembagian = bilangan1/bilangan2;
            System.out.println("Hasil Pembagian : "+ hasilPembagian );
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan");
        }
    }
}
