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
public class PerulanganDoWhile{
    public static void main(String[] args) {
        
//      Buat variabel angka yang tipe datanya integer
        int angka = 1;
        
        
        do { 
            System.out.println("Perulangan Ke :" + angka); //Perintah cetak nilai angka
            angka++; //Nilai angka ditambah dengan 1
        } while(angka <= 5); //Pengecekan apakah angka kurang dari sama dengan 5
    }
}
