/*
 * Разработать программу, которая выводит на экран горизонтальную линию из символов. 
 * Число символов, какой использовать символ, и какая будет линия - вертикальная, 
 * или горизонтальная - указывает пользователь. 
 */
/**
 *
 * @author UgaevEugene
 */
package LessonThreeStep;

import java.util.Scanner;

public class HorizontalLine {

    int vid, type, lenght;

    public HorizontalLine() {
        vid = 0;
        type = 0;
        lenght = 0; //Длина линии 
    }

    public void Line() {

        Scanner inputAmount = new Scanner(System.in);
        Scanner inputType = new Scanner(System.in);
        Scanner inputLenght = new Scanner(System.in);

        System.out.println("Enter to VID: ");
        vid = inputAmount.nextInt();

        System.out.println("Enter to TYPE: ");
        type = inputType.nextInt();

        System.out.println("Enter to LENGHT: ");
        lenght = inputLenght.nextInt();

        if (vid == 1) {

            if (type == 1) {

                for (int i = 0; i < lenght; i++) {
                    System.out.print('*');
                }

            } else {
                for (int i = 0; i <= lenght; i++) {
                    System.out.print('+');
                }

            }

        }
        if (vid == 2) {

            if (type == 1) {

                for (int i = 0; i <= lenght; i++) {
                    System.out.println('*');
                }

            } else {
                for (int i = 0; i <= lenght; i++) {
                    System.out.println('+');
                }

            }

        }
        inputAmount.close();
        inputType.close();
        inputLenght.close();
    }

}
