/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author iNez-Server
 */
public class App {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue();
        myQueue.enqueue(10);
        myQueue.enqueue(100);
        myQueue.enqueue(1000);
        
        System.out.println(myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.size());
    }
}
