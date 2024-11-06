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
public class PerulanganForEach {
    public static void main(String[] args) {
        
//      Buat Array bernama angka yang isinya angka 10 - 50
        int[] angka = {10,20,30,40,50};
        
//     Kode perulangan menggunakan foreach untuk mengakses semua nilai dari array
        for(int num : angka) {
            System.out.println(num);
        }
    }
}
