/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackLinkedList;

/**
 *
 * @author iNez-Server
 */
public class Stack<T extends Comparable<T>> {
    private Node<T> root;
    private int count;
    
    //O(1)
    public void push(T newData){
        this.count++;
        
        if(this.root == null){
            this.root = new Node<>(newData);
        }else{
            Node<T> oldRoot = this.root;
            this.root = new Node<>(newData);
            this.root.setNextNode(oldRoot);
        }
    }
    
    //O(1)
    public T pop(){
        T itemToPop = this.root.getData();
        this.root = this.root.getNextNode();
        this.count--;
        return itemToPop;
    }
    
    public T peek(){
        return this.root.getData();
    }
    
    //O(1)
    public int size(){
        return count;
    }
    
    //O(1)
    public boolean isEmpty(){
        return this.root == null;
    }    
    
}
