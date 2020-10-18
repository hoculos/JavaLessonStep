/*
 * 
 *  Написать программу, которая находит сумму всех целых нечетных чисел в 
 *  диапазоне, указанном пользователем.
 */
package LessonThreeStep;

import java.util.Scanner;

/**
 *
 * @author EugeneUgaev
 */
public class SumOddIntegers {

    int range, result;

    public SumOddIntegers() {
        range = 0;
        result = 0; 

    }

    public void Range() {

        Scanner valueRange;
        int[] arrayRange;
        try (Scanner inputRange = new Scanner(System.in)) {
            valueRange = new Scanner(System.in);
            System.out.println("Enter to RANGE: ");
            range = inputRange.nextInt();
            System.out.println("*****");
            arrayRange = new int[range];
            for (int i = 0; i < arrayRange.length; i++) {
                
                arrayRange[i] = valueRange.nextInt();
                
            }   System.out.println("*****");
            for (int i : arrayRange) {
                
                System.out.print(i + " ");
                
            }   System.out.println("\n*********");
            System.out.println("Array LENGHT: " + arrayRange.length);
        }
        valueRange.close();
        
        for (int i = 0; i < arrayRange.length; i++) {

            if(arrayRange[i] % 2 == 1){
                result = result + arrayRange[i];
            }
            

        }
        
        System.out.println("\n*****");
        System.out.println("Result: " + result);
        
    }
    

}
