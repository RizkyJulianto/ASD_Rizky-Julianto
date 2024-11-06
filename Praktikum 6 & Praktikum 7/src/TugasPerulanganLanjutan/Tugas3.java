/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPerulanganLanjutan;
//Import Package Scanner
import java.util.Scanner; 
/**
 *
 * @author HP
 */
public class Tugas3 {
    public static void main(String[] args) {
        
//  Buat scanner baru dengan nama scannner
        Scanner scanner = new Scanner(System.in);
        
// Tulis perintah untuk mencetak menggunakan System.out.print agar user dapat melakukan input
        System.out.print("Masukan Jumlah baris : ");
//Buat variable N yang tipe datanya integer , kemudian masukan kode untuk membaca input
        int N = scanner.nextInt();
       
        for(int i = 1; i<= N; i++) {//Kode for yang berisi inisialisasi,kondisi dan iterasi
            for(int j = 1; j<= i; j++) { //Kode for yang berisi inisialisasi,kondisi dan iterasi
                System.out.print("* "); //Perintah cetak * jika kondisi perulangan bernilai true
            }
            System.out.println(); //Perintah cetak untuk menghasilkan baris kosong dikonsol
       } 
        
    }
}
