package FreeCodeCampBeginners;
import java.util.HashMap;
public class HashMapsDemo {
    public static void main(String[] args){
       HashMap<String, Integer> examScores = new HashMap<String, Integer>();

       examScores.put("Math",75);
       examScores.put("English",85);
       examScores.put("Science",95);

       System.out.println(examScores.toString());    //They get printed in random manner
       System.out.println(examScores.get("English"));

       examScores.replace("Math",75,70);
       System.out.println(examScores.toString());

       System.out.println(examScores.getOrDefault("Religion",0));
       // in the above if we get that value religion then print that otherwise print default that is 0

       // examScores.clear(); //Clears the items from hash map

       examScores.remove("Science");
       System.out.println(examScores.toString());

       System.out.println(examScores.containsKey("Math"));
        System.out.println(examScores.containsValue(100));

        examScores.forEach((subject, score) ->{
            System.out.println(subject +" - "+score);
        });








    }
}
