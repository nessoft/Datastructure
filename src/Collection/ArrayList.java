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
public class ArrayList { // ArrayList is efficient for random access read, add item but not good with remove.
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        
        list.add("Nez");
        list.add("Thanisorn");
        list.add("Developer at Agoda");
        
        //System.out.println(list.get(0)); //random access very fast O(1).
        //System.out.println(list.size());
        
        Object[] array = list.toArray();
       
        for(Object s: array){
            System.out.println(s);
        }
    }
}
