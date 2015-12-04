import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       // add the following names in the sequence
       names.addAll( Arrays.asList("Alice", "Bob", "Connie", "David","Edward", "Fran", "Gomez",  "Harry"));
       System.out.println(names);
       //Prints out the names of the first and last name
       System.out.println(names.get(0));
       System.out.println(names.get(names.size()- 1));
       // Prints the size of the array list
       System.out.println(names.size());
       //Replace a element in the array
       int index = names.indexOf("Alice");
       names.set(index, "Alice B. Toklas");
       //add Doug after david using different add
       names.add(names.indexOf(("Doug")+1), "David");
       // Print each name in the arraylist
       for ( int i = 0;
             i < names.size();
             i++)
             {
                 System.out.println(names.get(i));
                }
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println(names2);
       //remove first element from names without eliminating the names2 ArrayList
       names.remove(0);
       System.out.println(names);
       System.out.println(names2);
   }
} 