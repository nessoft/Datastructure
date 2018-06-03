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
public interface List<T> {
    public void insert(T data);
    public void remove(T data);
    public void traverseList();
    public int size();
}
