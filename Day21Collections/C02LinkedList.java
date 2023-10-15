package Day21Collections;

import java.util.LinkedList;
import java.util.Locale;

public class C02LinkedList {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();

        countries.add("France");
        countries.add("Italy");
        countries.add("Turkey");
        countries.add("Germany");
        countries.add("United Kingdom");
        System.out.println(countries);  // [France, Italy, Turkey, Germany, United Kingdom]

        //  peek() method and element() method returns the first element but don't remove it
        // peek() method returns null when run with an empty list
        // element() method throws NoSuchElementException when run with an empty list

        String firstCountry = countries.peek();  // Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(firstCountry);  // France
        System.out.println(countries);  // [France, Italy, Turkey, Germany, United Kingdom]

        String country01 = countries.element();  // Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(country01); // France
        System.out.println(countries);  // [France, Italy, Turkey, Germany, United Kingdom]


        LinkedList<String> names = new LinkedList<>();
        System.out.println(names.peek());     // null

        // System.out.println(names.element());  // NoSuchElementException

        // pop() method and poll() method retrieve the first element from the list and remove it
        // pop() method throws NoSuchElementException when run on an empty list
        // poll() method returns null when run on an empty list

        String s = countries.pop();  // This method is equivalent to removeFirst().
        System.out.println(s);  // France
        System.out.println(countries);  // [Italy, Turkey, Germany, United Kingdom]


        String n = countries.poll();  // Retrieves and removes the head (first element) of this list.
        System.out.println(n);  // Italy
        System.out.println(countries);  // [Turkey, Germany, United Kingdom]
        // System.out.println(names.pop()); // NoSuchElementException
        System.out.println(names.poll());  // null


    }

}