/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author iNez-Server
 */
public class Factorial {
    public static int factorial(int n){
        if(n == 0)
            return 1;
        
        return n * factorial(n-1);    
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
