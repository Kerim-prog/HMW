package lesson.collections;
import java.util.*;
public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0,34);
        list.set(0,77);
        list.add(88);
        for(int a:list){
            System.out.println(a);

        }
        //System.out.println("list size="+list.size());

        list.forEach(Integer->System.out.println(Integer));  //Lambda Expression

        list.remove(1);

        list.forEach(System.out::println);  //Lambda Expression


    }
}
