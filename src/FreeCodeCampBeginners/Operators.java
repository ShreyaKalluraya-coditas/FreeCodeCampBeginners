package FreeCodeCampBeginners;
//if we perform operation on two int the result will be integer
//if we perform operation on one int and one double the operation will result into double
public class Operators {
    public static void main(String[] args){
       double number1 = 12;
       int number2 = 18;

       int age=21;

       boolean isStudent = false;       //boolean
       boolean isLibraryMember = true;

       int score =0;
       int turns = 10;

       score++;          //Increment Operator
       turns--;

       System.out.println(number1 + number2);        //Arithmetic operation
       System.out.println(number1/number2);
       System.out.println(number1-number2);
       System.out.println(number1*number2);
       System.out.println(number1%number2);

        System.out.println(number1==number2);
        System.out.println(number1!=number2);
        System.out.println(number1>number2);
        System.out.println(number1<number2);

        System.out.println(age>=18 && age<=40);  //This will return true
        System.out.println(isStudent || isLibraryMember);
        System.out.println(!isStudent);

        System.out.println(score);
        System.out.println(turns);





        





    }


}
