package FreeCodeCampBeginners;//You can not have un intialized variable in java

public class Variables {
      static int age = 27;
    public static void main(String[] args){
        //int age =21;
        int age;         //local variable
        age = 21;
      //  int age = 23; this is not allowed
        System.out.println("I am " +age+ " years old" );
    }
}
