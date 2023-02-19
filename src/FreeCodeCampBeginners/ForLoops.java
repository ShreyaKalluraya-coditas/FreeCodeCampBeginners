package FreeCodeCampBeginners;

public class ForLoops {
    public static void main(String[] args){

        for(int number = 1;number<=10;number++){
            System.out.println(number);
        }
        int sum =0;
        int numbers[] ={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
            //System.out.println(numbers[i]);
        }
        System.out.println(sum);


        for(int number =1;number<=10;number++){
            for(int multiplier =1;multiplier<=10;multiplier++){
                System.out.printf("%d x %d = %d  \n",number,multiplier,number*multiplier);
            }
        }




    }
}
