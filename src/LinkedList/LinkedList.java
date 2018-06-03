/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author iNez-Server
 */
public class LinkedList<T extends Comparable<T>> implements List<T>{
    
    private Node<T> root;
    private int sizeOfList;
    @Override
    public void insert(T data) {
        ++this.sizeOfList;
        if(root == null){
            this.root = new Node<>(data);
        }else{
            insertDataAtBeginning(data);
        }
    }

    @Override
    public void remove(T data) {
        if(this.root == null)
            return;
        
        --this.sizeOfList;
        
        if(this.root.getData().compareTo(data) == 0){
            this.root = this.root.getNextNode();
        }else{
            remove(data, root, root.getNextNode());
        }
        
    }

    @Override
    public void traverseList() {
        if(this.root == null) return;
        
        Node<T> actualNode = this.root;
        while(actualNode != null){
            System.out.print(actualNode + " => ");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }

    // O(1)
    private void insertDataAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }
    
    // O(N)
    private void insertDataAtEnd(T data,Node<T> node){
        if(node.getNextNode() != null){
            insertDataAtEnd(data, node.getNextNode());
        }else{
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    private void remove(T dataToRemove, Node<T> previosNode, Node<T> actualNode) {
        while(actualNode != null){
            if(actualNode.getData().compareTo(dataToRemove) == 0){
                previosNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            
            previosNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }
    
}
