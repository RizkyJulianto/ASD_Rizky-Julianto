/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPerulangan;
//import Scanner
import java.util.Scanner;

public class TugasPerulangan3 {
    public static void main(String[] args) {
        
//     Deklarasikan Scanner
        Scanner cek = new Scanner(System.in);
        
//     Buat variable angka yang tipe datanya integer
        int angka;
//     Cetak perintah memasukan angka
        System.out.print("Masukan angka (0 untuk berhenti) : ");
//     Perintah untuk menampung input user kedalam variabel angka menggunakan nextInt
        angka = cek.nextInt();
        
        while(angka != 0) { //kondisi perulangan
            System.out.println("Anda memasukan angka : " + angka); //Perintah cetak nilai dari variabel angka
            System.out.print("Masukan angka (0 untuk berhenti) : "); //perintah memasukan angka
            angka = cek.nextInt(); //Perintah untuk menampung input user kedalam variabel angka menggunakan nextInt
        }
        
        System.out.println("Terimakasih sudah menggunakan program ini"); //Perintah cetak yang dijalankan ketika kondisi bernilai false
        cek.close(); //Perintah menutup objek scanner
    }
}
