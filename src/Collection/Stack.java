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
public class Stack {
    /*
    * A Stack is a data structure where you add elements to the "top  of the stack,
    * and also remove element from the top again
    *
    * Last In First Out (LIFO) principle
    *
    * - Stack's are really good for some type of data processing
    *   For instance if you are parsing an XML file using either SAX or StAX
    *
    * push() method pushes an object onto the top of the Stack
    * peek() method returns the object at the top of the stack, but does not remove object
    * pop() method returns the object at the top of the stack, and removes the object from the Stack
    *
    * Applications --> for example graph traversing with depth-first search!!
    */
    
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack.peek());
        System.out.println(stack.size());
        
        for(Integer i : stack){
            System.out.println(i);
        }
        
        System.out.println(stack.size());
        
        
    }
}
