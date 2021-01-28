package homework.day.ten;

import java.util.*;

public class SortString {
    public static void main(String[] args) {

        String txt = "Hello World";
        char[] c = txt.toCharArray();
        Arrays.sort(c);
        //System.out.println(c);
        getIndexes(txt);
    }


    private static Map<String,List<Integer>> getIndexes(String t)
    {
        Map<String,List<Integer>> map = new HashMap<>();
        List<Integer> UpperCaseIndexes = new ArrayList<>();
        List<Integer> LowerCaseIndexes = new ArrayList<>();
        List<Integer> SpaceIndexes = new ArrayList<>();

        int i=0;
        for(i = 0; i < t.length(); i++) {
        char character = t.charAt(i);


        if(Character.isUpperCase(character)) {
            UpperCaseIndexes.add(i);
        }
        else if(Character.isLowerCase(character)) {
            LowerCaseIndexes.add(i);
        }
        else {
            SpaceIndexes.add(i);
        }

        map.put("UpperCase",UpperCaseIndexes);
        map.put("LowerCase",LowerCaseIndexes);
        map.put("Spaces",SpaceIndexes);

        }

        return map;

    }


}
