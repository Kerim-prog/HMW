package javagroup;
import java.util.*;

public class Human {
    /*
    (name)
(surname)
date of birth (year), number
IQ level (iq) (a whole number from 1 to 100))
(pet) (object type Pet)
(mother) (object type Human)
(father) (object type Human)
     */
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private Map<String,String> schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, Map<String,String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }
    
    public Map<String,String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String,String> schedule) {
        this.schedule = schedule;
    }

    /*
    (greetPet)("Hello, [the name of the pet]")
(describePet): (display the information about your pet: "I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50".
     */

    public void greetPet()
    {
        System.out.println("Hello, "+this.pet.getNickname()+"");
    }

    public void describePet()
    {
        String trick;
        if(this.pet.getTrickLevel()>50)
            trick = "very sly";
        else trick = "almost not sly";
        System.out.println( "I have a "+this.pet.getSpecies()+", he is "+this.pet.getAge()+" years old, he is "+trick);
    }

    public String toString() {
        return "Human {name: '" + this.name +
                "', surname: '" + this.surname +
                "', year: " + this.year +
                ", iq:"+ this.iq+
                ", mother:"+this.getMother().name +" "+this.getMother().surname+
                ", father:"+this.getFather().name +" "+this.getFather().surname+
                ", pet:"+this.pet.toString()+"}";

    }



}
