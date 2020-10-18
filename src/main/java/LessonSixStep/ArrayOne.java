package LessonSixStep;

/**
 *
 * @author EugeneUgaev
 *
 * Входными данными во всех описанных ниже заданиях является массив из 10
 * элементов, заполненный пользователем с клавиатуры. 1. Написать
 * программу,которая выводит содержимое массива наоборот. Пример: массив 23 11 6
 * превращается в 6 23 11. 2. Написать программу, которая находит сумму четных и
 * сумму нечетных элементов массива. 3. Написать программу, которая находит в
 * массиве значения, повторяющиеся два и более раз, и показывает их на экран. 4.
 * Написать программу, которая находит в массиве самое маленькое нечетное число
 * и показывает его на экран.
 */
public class ArrayOne {

    private final int ReverseArray[] = new int[10];
    private final int RandomArray[] = new int[10];
    private int Array[] = new int[10];
    private final int in = 0;
    private final int out = 10;
  

    private int[] CreateArray() {

        for (int i = 0; i < RandomArray.length; i++) {
            RandomArray[i] = in + (int) (Math.random() * out);

        }

        return RandomArray;
    }

    private int[] ImplementationArray() {

        Array = CreateArray();

        return Array;
    }

    private int[] ReverseArray() {

        for (int i = Array.length - 1, j = 0; j < ReverseArray.length; j++, i--) {

            ReverseArray[j] = Array[i];

        }

        return ReverseArray;
    }

    public void ShowArray() {

        ImplementationArray();

        for (int i = 0; i < Array.length; i++) {

            System.out.print(Array[i]);
        }

        System.out.println("\nReverseArray");

        ReverseArray();

        for (int i = 0; i < ReverseArray.length; i++) {

            System.out.print(ReverseArray[i]);

        }

    }

}
