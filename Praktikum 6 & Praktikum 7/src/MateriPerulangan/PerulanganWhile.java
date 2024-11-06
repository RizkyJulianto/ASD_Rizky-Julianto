/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriPerulangan;

/**
 *
 * @author HP
 */
public class PerulanganWhile {
    public static void main(String[] args) {
        
//Inisialisasi variabel angka yang tipe datanya integer
        int angka = 11;
        
//Perulangan while dimana kondisinya akan berhenti melakukan pengulangan jika angka lebih dari 10
        while(angka <= 10) {
//Perintah cetak menggunakan System.out.println
            System.out.println("Perulangan Ke : " + angka);
           
//Kemudian lakukan penjumlahan dengan tambahkan operator ++ yang artinya ditambah dengan 1
            angka++;
        }
    }
}
