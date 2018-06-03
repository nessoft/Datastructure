/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.List;

/**
 *
 * @author iNez-Server
 */
public class LinkedList {
    /*
     * It is another implementation of the List interface
     * - implements List, Queue, Dequeue interfaces + ...
     *  
     * It uses references -> each item has a reference to the next item + store 
     * the data itself
     *
     *  34 -> 100 -> -12 -> 1 single linked list
     *  34 <-> 100 <-> -12 <-> 1 doubly linked list
     *
     * - NO RAMDOM ACCESS !!!
     * - Not syncronized
     * - We can remove items ver efficiently / O(1) only remove at first or end.
     *   
     * - No sequential access ! if we want to find an item we have to iterate
     *   through the list until we find it / O(N)
     * - remove operation is very efficient: just update the references/pointers O(1)
     * 
     * - so we should use a linkedList for remove-heavy applications!!!
     */
    public static void main(String[] args) {
        List<Integer> list = new java.util.LinkedList<>();
        
        list.add(3);
        list.add(10);
        list.add(20);
        
        for(Integer i : list)
            System.out.println(i);
    }
}
