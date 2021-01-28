package javagroup;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.setNickname("Djess");
        p.setAge(15);
        p.setTrickLevel(60);
        Set<String> habits= new HashSet<>();
        habits.add("eat");
        habits.add("drink");
        habits.add("sleep");
        p.setHabits(habits);

        Human mother = new Human();
        mother.setName("Jane");
        mother.setSurname("Karleone");

        Human father = new Human();
        father.setName("Vito");
        father.setSurname("Karleone");


        Map<String,String>sch = new HashMap<>();
        sch.put("Monday","Walking");
        sch.put("Tuesda","Cinema");
        Human h = new Human("Michael","Karleone",1977,90,p,mother,father,sch);

        System.out.println(h.toString());

    }
}
