package Day22Colllections_maps;

import java.util.Arrays;
import java.util.HashMap;

public class sdaasd {
    public static void main(String[] args) {
        String s = "Java is easy, Java is OOP, OOP makes Java easy.";
        System.out.println(s);

        //To make "easy," and "easy." same remove all punctuation marks
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);

        //Create a map
        HashMap<String, Integer> occ = new HashMap<>();

        //Get the words from the String by using split(" ")
        String[] words=s.split("");
        System.out.println(Arrays.toString(words));
    }
}
