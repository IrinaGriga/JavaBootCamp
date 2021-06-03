package sef.module9.activity;

//Needs to be completed
import java.util.*;


public class SetActivity {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Lidija");
        set.add("Fedor");
        set.add("Gregor");
        set.add("Alla");
        set.add("Boris");
        set.add("Zina");
        set.add("Zina");

        {
            System.out.println("Original HashSet: "
                    + set);
        }

        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);

        // Print the sorted elements of the HashSet
        System.out.println("HashSet elements "
                + "in sorted order "
                + "using List: "
                + list);

        //1 - Type code to create a set of names.
        //Names must be sorted by their natural order.
        //Do research to find if you already have such a class.
        //Also try adding a few duplicate entries to this set.


        TreeSet<String> dupliCheckr = new TreeSet<String>();

        for (String element : set) {

            // Displaying duplicate entries
            if (!dupliCheckr.add(element)) {

                // Print and display elements in an array
                // which are duplicated.
                System.out.println(
                        "Duplicate Data entered : " + element);

                //2 - Call print method to print the set passed as its parameter.

            }

//	void print(Set set)
            {
                //3 - Type code to print this set
                //Notice the order in which elements get printed.
            }
        }
    }
}