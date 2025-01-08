/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;


/**
 *
 * @author HP
 */
public class Array {
    public static void main(String[] args) {
      ArrayList <Integer> angka = new ArrayList<>();
      
      
      for(int i = 1; i<=5; i++) {
          angka.add(i);
      } 
      
        System.out.println(angka);
        
//     Menghapus elemen pada ArrayList menggunakan remove
        angka.remove(2);
        
        System.out.println("ArrayList setelah dihapus" + angka);
        
    }
}
