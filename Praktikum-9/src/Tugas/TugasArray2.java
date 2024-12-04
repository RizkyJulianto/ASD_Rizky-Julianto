/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
//Import package scanner
import java.util.Scanner; 
/**
 *
 * @author HP
 */
public class TugasArray2 {
    public static void main(String[] args) {
//       Deklarasi Scanner dengan nama baca
        Scanner baca =  new Scanner(System.in);
//       Deklarasi variabel siswa yang merupakan string tipe datanya adalah string
        String[] siswa = new String[6];
        
//      Tulis perintah untuk mencetak menggunakan System.out.print agar tidak membuat baris baru
        System.out.print("Masukan Siswa pertama : ");
//      baca inputan dari user kemudian tampung kedalam variabel siswa dengan index 0 atau pertama
        siswa[0] = baca.nextLine();
        System.out.print("Masukan Siswa kedua : ");
        siswa[1] = baca.nextLine();      
        System.out.print("Masukan Siswa ketiga : ");
        siswa[2] = baca.nextLine();
        System.out.print("Masukan Siswa keempat : ");
        siswa[3] = baca.nextLine();
        System.out.print("Masukan Siswa kelima : ");
        siswa[4] = baca.nextLine();
        System.out.print("Masukan Siswa keenam : ");
        siswa[5] = baca.nextLine();
//      saya buat system.out.println dengan isi string kosong gunanya untuk memberikan space kosong agar tidak terlalu mepet
        System.out.println("");
        
        
        System.out.println("======DAFTAR NAMA SISWA======");
        
//      saya tulis perintah menampilkan data array menggunakan perulangan foreach
//      saya buat variabel data yang tipe datanya adalah string yang akan berisi semua data dari variabel siswa
        for(String data : siswa) { 
//      saya tulis perintah cetak menggunakan system.out.print(data) untuk menampilkan semua isi dari variabel data
            System.out.println(data); 
        }
    }
}
