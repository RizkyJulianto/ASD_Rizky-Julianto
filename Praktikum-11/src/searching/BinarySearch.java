/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author HP
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] nilai = {66,77,80,84,88,99,100};
        BinarySearchInt(nilai , 77);    
    }

    private static void BinarySearchInt(int[] angka, int key) {
       int low = 0, high = angka.length-1, median;
       boolean status = false;
       while(low < high) {
           median = (low + high)/2;
                if(key == angka[median]) {
                    System.out.println(key + "ditemukan pada posisi ke -" + (median+1) + " dan pada index ke-" + median);
                    status = true;
                    break;
       } else {
            if(key > angka [median]) {
                low = median + 1;
            } else {
                high = median -1;
            }
        }
     }
       
       
     if(status == false) {
         System.out.println(key + " tidak ditemukan dalam array ");
     }
       
   }
}
