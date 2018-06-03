/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackArray;

/**
 *
 * @author iNez-Server
 */
public class App {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();        
        
        myStack.push(10);
        myStack.push(100);
        myStack.push(1000);
        
        System.out.println(myStack.size());
        
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
