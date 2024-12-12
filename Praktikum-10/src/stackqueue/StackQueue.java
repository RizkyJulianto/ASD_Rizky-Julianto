/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueue;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author HP
 */
public class StackQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        System.out.println("Isi Queue : " + queue);
        
//      Mengakses elemen pertama 
        System.out.println("Elemen pertama : " + queue.peek());
        
//       Menambahkan elemen lagi kedalam queue 
        queue.add(40);
        System.out.println("Isi Queue setelah ditambahkan : " + queue);
        
        System.out.println("Apakah Queue kosong ? " + queue.isEmpty());
    }
}
