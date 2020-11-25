
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Employees {
    private ArrayList<Person> persons;
    
    public Employees(){
        this.persons = new ArrayList<>();
    }
    
    public void add (Person personToAdd){
        this.persons.add(personToAdd);
    }
    
    public void add (List<Person> peopleToAdd){
        Iterator<Person> iterator = peopleToAdd.iterator();
        
        while (iterator.hasNext()){
            persons.add(iterator.next());
        }
    }
    
    public void print(){
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()){
            Person nextInList = iterator.next();
            System.out.println(nextInList);
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()){
            Person nextInList = iterator.next();
            if (nextInList.getEducation() == education){
                System.out.println(nextInList);
            } 
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()){
            Person nextInList = iterator.next();
            if (nextInList.getEducation() == education){
                iterator.remove();
            }
        }
    }
    
    
    
}
