package FreeCodeCampBeginners;

import java.util.Arrays;

public class DemoArray {

    public static void main(String[] args) {
        char vowels[] = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'i';
        vowels[2] = 'e';
        vowels[3] = 'o';
        vowels[4] = 'u';

        System.out.println(Arrays.toString(vowels));

        char vowel[] ={'a','e','i','o','u'};
        //vowel[2]='x';
        System.out.println(Arrays.toString(vowel));

        System.out.println(vowel.length);


        //ending index is not included
        Arrays.sort(vowels,1,3);

        //Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

        char key = 'o';
        int foundIndex = Arrays.binarySearch(vowels, key);
        System.out.println(foundIndex);

        //when we search for a char which is not present it sometimes return -2 ,-6 different value.

        Arrays.fill(vowels,'x');
        System.out.println(Arrays.toString(vowels));



        int numbers[] = {1,2,3,4,5};
        int copyOfNumbers[] = numbers;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));

        //Whatever changes you do in numbers array will be reflected in copyOfNumbers Array because second array has different name but it is still pointing to the first array reference form.

        //To Copy An Array Properly

        int copyNumbers[] = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(copyNumbers));


    }

    }
