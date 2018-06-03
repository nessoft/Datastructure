/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author iNez-Server
 */
public class App {
    public static void main(String[] args) {
        int[] nums = new int[5];
        
        for(int i=0;i<nums.length;i++)
            nums[i] = i+1;
        
        // O(1) random index
        int num = nums[3];
        System.out.println(num);
        
        // O(N) "Linear search" --> O(logN) binary trees --> O(1) hash tables
        for(int i=0;i<nums.length;i++)
            if(nums[i] == 4)
                System.out.println("Index found, " + i);
    }
}
