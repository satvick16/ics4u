/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classinaclass;

import java.util.ArrayList;

/**
 * A class to manage a list of Person objects.
 *
 * @author satvi
 */
class People {

    private ArrayList<Person> people;
    
    public People() {
        this.people = new ArrayList<>();
    }
    
    void addPerson(Person p) {
        this.people.add(p);
    }
    
    void addPerson(String name, int age) {
        this.people.add(new Person(name, age));
    }
    
    void happyBirthday(String name) {
        for (Person p : this.people) {
            if (p.getName().equals(name)) {
                p.getOlder();
            }
        }
    }
    
    @Override
    public String toString() {
        String out = "People:\n";
        
        for (Person p : this.people) {
            out += p.toString() + "\n";
        }
        
        return out;
    }

}
