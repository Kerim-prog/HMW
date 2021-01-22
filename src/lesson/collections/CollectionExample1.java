package lesson.collections;
import java.util.*;

public class CollectionExample1 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ArrayList arrayList = new ArrayList();
        arrayList.add("string");
        arrayList.add(23);

        Set<String> set = new LinkedHashSet<>();
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        set.add(a);
        set.add(c);
        System.out.println(set);

        /*
        Map<Integer,Person> map = new HashMAp<>();
        map.put(1,person1);
        map.put(2,person2);

        map.forEach((key,value)->{
        if(key==3)
        System.out.println(value);
        });
         */


    }
}
