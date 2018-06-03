/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Comparator;

/**
 *
 * @author iNez-Server
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    @Override
    public int compareTo(Person person) {        
        
        int cName = this.name.compareTo(person.getName());
        if(cName != 0)
            return cName;
        
        return Integer.compare(this.age, person.getAge());
        
    }
    
}
