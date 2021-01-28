package javagroup;

import java.util.*;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private int  trickLevel;
    private Set<String> habits;

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, Set<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if(trickLevel>0&&trickLevel<=100)
        this.trickLevel = trickLevel;
        else System.out.println("Səhv daxil etmisiniz (1-100 arası tam ədəd daxil edin)");
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }


    public void eat()
    {
        System.out.println("I am eating");
    }

    public void respond()
    {
        if(this.nickname!=null)
        System.out.println("Hello, owner. I am "+this.nickname+". I miss you!");
        else
            System.out.println("Hello, owner. I miss you!");
    }

    public void foul()
    {
        System.out.println("I need to cover it up");
    }

    public String toString() {
        return "dog {nickname: '" + this.nickname + "', age: " + this.age + ", tricklevel: " + this.trickLevel + ", habbits:"+ this.habits+"}";
    }

}
