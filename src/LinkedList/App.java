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
public class App {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<Person>();
        list.insert(new Person(5,"Adam"));
        list.insert(new Person(10,"Joe"));
        list.insert(new Person(10,"Kevin"));        
        list.insert(new Person(45,"Michael"));
        
        System.out.println(list.size());
        list.remove(new Person(10,"Joe"));
        list.traverseList();
        
        
    }
}
