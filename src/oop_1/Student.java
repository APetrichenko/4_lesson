package oop_1;

/**
 * Created by ITHILLEL6 on 30.06.2015.
 */
public class Student {
    int id;
    public String surname; //u novogo studenta zna4eniya budut NULL
    public int[] marks;

    public void come(){
        System.out.println("Student number " + id + "came");
    }
    public void leave(){
        System.out.println("Good bye!!!");
    }
}
