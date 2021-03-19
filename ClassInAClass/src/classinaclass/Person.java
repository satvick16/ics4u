/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classinaclass;

/**
 *
 * @author satvi
 */
class Person {
    
    private String name;
    private int age;
    
    public Person(String name) {
        this.name = name;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    
    void getOlder() {
        this.age++;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.age + " years old";
    }
    
}
