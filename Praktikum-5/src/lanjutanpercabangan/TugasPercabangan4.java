/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanjutanpercabangan;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TugasPercabangan4 {
    public static void main(String[] args) {
        Scanner cek = new Scanner(System.in);
        
        int nilai;
        System.out.print("Masukan Nilai anda : ");
        nilai = cek.nextInt();
        
        if(nilai > 90 ) {
           System.out.println("Sempurna");
        } 
        else if(nilai >= 80) {
            System.out.println("Nilai A");
         
        } else if(nilai >= 60 && nilai < 80 ) {
            System.out.println("Nilai B");
        } else if(nilai >= 40 && nilai < 60) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }
        
    }
}
