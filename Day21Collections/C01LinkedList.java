package Day21Collections;

import com.sun.source.tree.NewArrayTree;

import java.util.LinkedList;

public class C01LinkedList {

         /*

     1) ArrayList and LinkedList are the child classes of List Interface
     2) ArrayList is successful in search operations, but not so effective for adding/removing operation
     3) LinkedList is not successful in search operations, but they are very effective for adding/removing operation
     4) LinkedList has "nodes" instead of elements
        Every node has two parts:
                                i) Data part
                                ii) Pointer Part
       First node is pointed by 'Head', the last node 'Tail' points to null

      */


    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.addFirst(12);
        linkedList.addLast(15);
        linkedList.add(3,19);
        System.out.println(linkedList); // [12, 6, 8, 19, 5, 2, 15]

        // If you want to remove any int data from LinkedList as an int number, convert it
        // to its wrapper class (Integer). This way , it will be taken as data part of the node
        // otherwise Java will deal with as an index

        linkedList.remove((Integer) 5);
        System.out.println(linkedList); // [12, 6, 8, 19, 2, 15]
        System.out.println(linkedList.remove()); // 12  =>  Retrieves and removes the head (first element) of this list.
        System.out.println(linkedList); // [6, 8, 19, 2, 15]


        int firstNode = linkedList.removeFirst();   // Removes and returns the first element from this list.
        System.out.println(firstNode);  // 6
        System.out.println(linkedList); // [8, 19, 2, 15]



        LinkedList<Integer> myList = new LinkedList<>();  // empty list

        // System.out.println(myList.remove());  // throws NoSuchElementException
        // System.out.println(myList.removeFirst());  // throws NoSuchElementException

        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(2);
        System.out.println(linkedList); // [8, 19, 2, 15, 2, 2, 2]
        System.out.println(linkedList.removeFirstOccurrence(2));
        System.out.println(linkedList); // [8, 19, 15, 2, 2, 2]
        System.out.println(linkedList.removeLastOccurrence(2));
        System.out.println(linkedList); // [8, 19, 15, 2, 2]


        myList.add(4);
        myList.add(19);
        myList.add(8);
        myList.add(2);
        System.out.println(myList); // [4, 19, 8, 2]



        linkedList.removeAll(myList);
        System.out.println(linkedList); // [15]



    }


}
