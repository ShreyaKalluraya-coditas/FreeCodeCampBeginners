package FreeCodeCampBeginners;

public class DoWhileLoops {
    public static void main(String[] args){
        int number =5;
        int multiplier = 1;

        do{
            System.out.printf("%d x %d = %d  \n",number,multiplier,number*multiplier);
            multiplier++;
        }while(multiplier <= 10);
    }
}
