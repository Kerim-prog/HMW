package lesson.collections;
import java.util.*;

public class CollectionExample1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elepphant");
        animals.add("Monkey");
        animals.add("Jerapah");

        animals.remove(3);

        for(int i=0;i<animals.size();i++)
        {
            System.out.println(animals.get(i));
        }

    }
}
