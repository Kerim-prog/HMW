package javagroup;

public class Main {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.setNickname("Djess");
        p.setAge(15);
        p.setTrickLevel(60);
        p.setHabits(new String[]{"eat", "drink", "sleep"});

        Human mother = new Human();
        mother.setName("Jane");
        mother.setSurname("Karleone");

        Human father = new Human();
        father.setName("Vito");
        father.setSurname("Karleone");


        Human h = new Human("Michael","Karleone",1977,90,p,mother,father,new String[][]{{}});

        System.out.println(h.toString());


    }
}
