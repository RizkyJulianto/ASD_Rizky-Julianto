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
public class TugasPercabangan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cek = new Scanner(System.in);
        
        String nama;
        float nilai_IPK;
        
        System.out.print("Masukan Nama Anda : ");
        nama = cek.nextLine();
        System.out.print("Masukan Nama IPK Anda : ");
        nilai_IPK = cek.nextFloat();
        
        if(nilai_IPK >= 3.5) {
            System.out.println("Cumlaude");
        } else if(nilai_IPK >= 3.0 ) {
            System.out.println("Sangat Memuaskan");
        } else if(nilai_IPK >= 2.5) {
            System.out.println("Memuaskan");
        } else if(nilai_IPK >= 2.0 ) {
            System.out.println("Cukup");
        } else {
            System.out.println("Tidak Lulus");
        }
        
    }
    
}
