/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class BeratBadanIdeal {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        
        char jenisKelamin;
        double tinggiBadan,beratBadanIdeal;
        
        System.out.print("Masukan Jenis Kelamin anda (L/P) : ");
        jenisKelamin = baca.next().charAt(0);
      

//        Lakukan validasi untuk input jenisKelamin hanya huruf L,l,P,p
        
        if(jenisKelamin != 'L' && jenisKelamin != 'l' && jenisKelamin != 'P' && jenisKelamin != 'p') {
            System.out.println("Jenis kelamin tidak sesuai");
            return;
        }
        System.out.print("Tinggi Badan : ");
        tinggiBadan = baca.nextDouble();
        if(jenisKelamin == 'L' || jenisKelamin == 'l') {
          beratBadanIdeal = (tinggiBadan - 100) - (0.1 * (tinggiBadan - 100));
            System.out.println("Berat badan ideal kamu adalah " + beratBadanIdeal);
        } else if(jenisKelamin == 'P' || jenisKelamin == 'p') {
            beratBadanIdeal = (tinggiBadan - 100) - (0.15 * (tinggiBadan - 100));
            System.out.println("Berat badan ideal kamu adalah " + beratBadanIdeal);
        } 
        
   
        
        
    }
}
