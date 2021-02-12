package homework.day.eleven;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExpressions {
    public static void main(String[] args) {
        thirdExercise();
    }

    private static void firstExercise()
    {

        // create an ArrayList
        ArrayList<String> colors1 = new ArrayList<>();
        ArrayList<String> colors2 = new ArrayList<>();
        ArrayList<String> joinedColors = new ArrayList<>();


        // add elements to the ArrayList
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Pink");

        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Black");
        colors2.add("Pink");

        colors1.forEach((e) -> {
            joinedColors.add(e);
        });

        colors2.forEach((e) -> {
            joinedColors.add(e);
        });

        joinedColors.forEach((e) -> {
            System.out.println(e);
        });

    }

    private static void secondExercise()
    {

        // create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        String search = "Red";


        // add elements to the ArrayList
        colors.add("Green");
        colors.add("White");
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");

        colors.forEach((e) -> {
            if(e.equals(search))System.out.println("Found");
        });

    }


    public static void thirdExercise()
    {  //????
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,2,5,6));

        numberList.stream()
                .filter(i -> i == 2)
                .forEach(i->System.out.println("Found"));

    }



}
