package Day24Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C02Lambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        printUppercaseSortedByLength(names);
        System.out.println();
        System.out.println(sortElementsByLengthThenAlphabeticalOrder(names));
        System.out.println();
        System.out.println(checkToBeGreaterThan(names,2));
        System.out.println();
        System.out.println(checkAnyElementGreaterThan(names, 5));
        System.out.println();
        System.out.println(checkNoElementStartsWithGivenValue(names,""));

    }

    //Example 1: Print the list elements on the console with all characters in uppercase by sorting in ascending order by using length
    public static void printUppercaseSortedByLength(List<String> list) {
        list.
                stream().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.println(t + " "));
    }

    //Example 2: Sort the elements by using their lengths, if some elements are in the same length put them in alphabetical order
    public static List<String> sortElementsByLengthThenAlphabeticalOrder(List<String> list) {
       return
               list.
                       stream().
                       sorted(Comparator.comparing(t -> t.toString().length()).thenComparing(t -> t.toString().charAt(1))).
                       collect(Collectors.toList());


    }

    //Example 3: Create a method checks if the length of all elements are greater than a given value
        public static boolean checkToBeGreaterThan (List<String > list,int num){
       return list.stream().allMatch(t-> t.length() > num);
    }
    //Example 4: Create a method checks if the length of any element is greater than a given value

    public static boolean checkAnyElementGreaterThan(List<String>list ,int num){
        return list.stream().anyMatch( t-> t.length() > num);

    }
    //Example 5: Create a method checks if no element starts with the given value
    public static boolean checkNoElementStartsWithGivenValue(List<String> list,String s){
        return  list.stream().noneMatch( t -> t.substring(0,1).equals(s));

    }
}