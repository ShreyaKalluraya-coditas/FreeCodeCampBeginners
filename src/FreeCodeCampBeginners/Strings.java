package FreeCodeCampBeginners;

public class Strings {
    public static void main(String []args){

        char percentSign = '%';
        System.out.println(percentSign);

        String name = "Hii This Is Java Program";
        System.out.println(name);

        String newName = new String("Hii This Is Java Program");
        System.out.println(newName);

        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2);

        //Types of string

        String myname = "Shreya";
        String country ="India";
        int age = 21;
        double gpa =8.54;
       // System.out.println("Hello World I am " +myname+" I am "+age+ " year old and I am from "+country);


        //Instead of above method we are going to use string format
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old.My gpa is %f.",myname,country,age,gpa);
        System.out.println(formattedString);
        //format specifier for character is %c and format specifier for boolean is %b.

        String sname = "Shreya Kalluraya";
        System.out.println(sname.length());    // Give us the length of the string
        System.out.println(sname.isEmpty());   //Tell us wether the string is empty or not
        System.out.println(sname.toUpperCase()); //coverts string to upper case

        System.out.println(objectString1.equals(objectString2));

        String string = "The Sky is Blue";
        System.out.println(string.replace("Blue","red"));

        System.out.println(string.contains("Sky"));













    }
}
