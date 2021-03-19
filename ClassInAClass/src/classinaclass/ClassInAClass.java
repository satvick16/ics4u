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
public class ClassInAClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Alan");
        p.setAge(50);
//        System.out.println(p);

        Person q = new Person("Ada", 42);
//        System.out.println(q);

        p.getOlder();
        q.getOlder();
        q.getOlder();

        System.out.println(p);
        System.out.println(q);

        // Make a class called People.
        People ppl = new People();
        ppl.addPerson(p);
        ppl.addPerson(q);
        System.out.println(ppl);
        
        ppl.addPerson("Albert", 19);
        System.out.println(ppl);
        
        ppl.happyBirthday("Albert");
        System.out.println(ppl);
    }

}
