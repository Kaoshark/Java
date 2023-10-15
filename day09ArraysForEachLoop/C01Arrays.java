package day09ArraysForEachLoop;

import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {

        //To leanr new topic
        // what is it
        // why do we need it
        // how do we use it
        //Mid-level implementiation should be practice
        //advanced-level implementations should be applicable
        /*



         */

        String[] stdNames= new  String[5];

        System.out.print(stdNames);//reference of the array is given [Ljava.lang.String;@6acbcfc0)]


        System.out.printf(Arrays.toString(stdNames));//[null, null, null, null, null]

        // How to add elements into an array

        stdNames[0]="Tom";
        stdNames[3]="Marry";
        stdNames[1]="Mark";
        stdNames[4]="Hanks";
        stdNames[2]="Jim";

        System.out.println(Arrays.toString(stdNames));

        //How to get a specific element from an Array

        String fourth=stdNames[3];
        System.out.printf(fourth);

        //Example 1:

        int[]ages=new int[4];

        ages[0]=12;
        ages[1]=5;
        ages[2]=7;
        ages[3]=1;

        System.out.printf(Arrays.toString(ages));//12,5,7,1
        int result=1;

        //1.way

        for (int i=0; i< ages.length ; i++){
            result=result*ages[i];


        }
        System.out.print(result);//420

        //2.way: for-each loop { Enhanced Loop)
        int result2=1;

        for (int w: ages){
            result2=result2*w;

        }
        System.out.print(result2);
        //
        //
        int[] nums= { 8,12,34,10,78,19};  // second way declare

        //1.way

        Arrays.sort(nums);
        System.out.printf(Arrays.toString(nums));

        int min= nums[0];
        int max=nums[nums.length-1];
        System.out.print(max-min);//770

        //2.way : for each loop



    }
}
