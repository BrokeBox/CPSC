/**
 * Exam question on singly-linked nodes.
 *
 * @author YOUR NAME (YOU@auburn.edu)
 * @author Dean Hendrix (dh@auburn.edu)
 */
public class LinkedNodesExamQuestion {

    /*

    >>>>>>>>>>>>>>>>>> INSTRUCTIONS <<<<<<<<<<<<<<<<

    1.  Read through this entire class to make sure you understand the context.
        A class named SinglyLinked is provided for you below. It provides an
        add method for adding new nodes on the front of the chain; this method
        should not be changed. It also provides a max method that you must
        complete. Note that the data type allowed in a Node is constrained to
        be a class that implements the Comparable interface and thus has a
        natural total order defined.

    2.  A sample main method is provided for you to illustrate the intended
        effect of building a simple chain of nodes and then finding the largest
        element using the max method.

    3.  Once you have read through all the provided source code, your task is
        to provide a correct implementation of the max method at the very bottom
        of this file.

    4.  Your grade will be solely determined by the percentage of test cases that
        your submitted code passes.

     */


    /** Provides an example. */
    public static void main(String[] args) {
        SinglyLinked<Integer> iChain = new SinglyLinked<>();
        iChain.add(10);
        iChain.add(12);
        iChain.add(8);
        iChain.add(2);
        iChain.add(6);
        iChain.add(4);
        Integer largestInteger = iChain.max();
        // The following statement should print 12.
        System.out.println(largestInteger);

        SinglyLinked<String> sChain = new SinglyLinked<>();
        sChain.add("W");
        sChain.add("A");
        sChain.add("R");
        sChain.add("E");
        sChain.add("A");
        sChain.add("G");
        sChain.add("L");
        sChain.add("E");
        String largestString = sChain.max();
        // The following statement should print W.
        System.out.println(largestString);
    }



    static class SinglyLinked<T extends Comparable<T>> {

        /** A reference to the first node in the chain. */
        Node front;

        /** Defines a node class. */
        class Node {
            T element;
            Node next;

            public Node(T elmt, Node nxt) {
                element = elmt;
                next = nxt;
            }
        }

        /** Constructs an empty chain. */
        public SinglyLinked() {
            front = null;
        }

        /** Adds a node with the given value to the front of the chain. */
        public void add(T value) {
            front = new Node(value, front);
        }


        /* >>>>>>>>>>>>>>>>>> YOUR WORK GOES BELOW <<<<<<<<<<<<<<<< */


        ///////////////////////////////////////////////////
        // YOU MUST COMPLETE THE BODY OF THE MAX METHOD. //
        ///////////////////////////////////////////////////
        /**
         * Returns the maximum element in the chain. If the chain is empty
         * (front is null), the max method should return null.
         */
        public T max() {
            T max = front.element;
            Node n = front;
            while (n != null) {
                if (n.element.compareTo(max) > 0) max = n.element;
                n = n.next;
            }
            return max;
        }
    }

}
