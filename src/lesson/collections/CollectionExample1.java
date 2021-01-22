package lesson.collections;
import java.util.*;

public class CollectionExample1 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Dog");
        ls.add("Cat");
        ls.add("Elepphant");
        ls.add("Monkey");
        ls.add("Jerapah");

        ls.remove(3);

        for(int i=0;i<ls.size();i++)
        {
            System.out.println(ls.get(i));
        }

    }
}
