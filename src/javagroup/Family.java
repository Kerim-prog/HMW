package javagroup;

import java.util.*;

public class Family {
    Human father = new Human();
    Human mother = new Human();
    List<Human> childrens = new ArrayList<Human>();
    Set<Pet> pets = new HashSet<>();

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public List<Human> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Human> childrens) {
        this.childrens = childrens;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }


}
