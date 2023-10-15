package Day22Colllections_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Homework {
    public static void main(String[] args) {
        //Homework: Create a method to display the number of occurrences of letters in a sentence
        //           Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1
        String s= "Java, Java, I love Java";
        System.out.println(s);

        s=s.replaceAll("[^A-Za-z]","");
        System.out.println(s);// JavaJavaILoveJava

         //To get letters one by one , use split
        String[] letters=s.split("");
        System.out.println(Arrays.toString(letters));

        HashMap<String, Integer> occ=new HashMap<>();

        //Count the number of occurrences

        for (String w : letters){
            Integer numOfOcc= occ.get(w);

            if (numOfOcc==null){
                occ.put(w,1);
            }else {
                occ.replace(w,numOfOcc+1);
            }
        }
        System.out.println(occ);

    }
}
