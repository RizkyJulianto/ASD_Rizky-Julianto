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
public class TugasOutputScanner {
    public static void main(String[] args) {
        Scanner biodata = new Scanner(System.in);
        System.out.print("Masukan NIM anda : ");
        String Nim = biodata.nextLine();
        System.out.print("Masukan Nama anda : ");
        String nama = biodata.nextLine();
        
        String[] studi = {"Informatika", "Sistem Informasi", "Teknologi Informasi"};
        
        System.out.println("Pilihan Program Studi : ");
        System.out.println("1. Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Teknologi Informasi");
        System.out.print("Masukan pilihan anda [1/2/3] ");
        
        int pilihan = biodata.nextInt();
        if(pilihan == 1) {
            System.out.println(nama + "dengan NIM" + Nim +"memilih program studi" +  studi[0]);
        } else if(pilihan == 2) {
            System.out.println(nama + "dengan NIM" + Nim +"memilih program studi" +  studi[1]);
        } else if(pilihan == 3) {
            System.out.println(nama + "dengan NIM" + Nim +"memilih program studi" +  studi[2]);
        }
        
        
        
    }
}
