package FreeCodeCampBeginners;
//Array size is fixed cannot change its size to do that you need to copy that array and change its length during that time
// for dynamic we use array list

import java.util.ArrayList;
import java.util.Comparator;
public class ArrayLists {
    public static void main(String [] args){
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    System.out.println(numbers.toString());

    //numbers.remove(2);
    System.out.println(numbers.toString());

    System.out.println(numbers.get(1));

   numbers.set(2,Integer.valueOf(30));
   System.out.println(numbers.toString());

   numbers.sort(Comparator.naturalOrder());
   System.out.println(numbers.toString());

   numbers.sort(Comparator.reverseOrder());
   System.out.println(numbers.toString());

   System.out.println(numbers.size());

   System.out.println(numbers.contains(Integer.valueOf(1)));

   System.out.println(numbers.isEmpty());

   numbers.forEach(number ->{       //for each number perform this
     System.out.println(number * 2);
   });








    }
}
