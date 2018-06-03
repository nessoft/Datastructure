/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackLinkedList;

import LinkedList.*;

/**
 *
 * @author iNez-Server
 * @param <T>
 */

public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> nextNode;
    
    public Node(T data){
        this.data = data;        
    }
    
    public T getData(){
        return data;
    }
    
    public void setData(T data){
        this.data = data;
    }
    
    public Node<T> getNextNode(){
        return nextNode;
    }
    
    public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
    }
    
    public String toString(){
        return this.data.toString();
    }
}
