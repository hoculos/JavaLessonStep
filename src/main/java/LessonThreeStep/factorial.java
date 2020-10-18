package LessonThreeStep;

/**
 * Дано натуральное число n. Написать программу, которая вычисляет факториал
 * неотрицательных целых чисел n (т.е. число целое и больше 0). Формула
 * вычисления факториала приведена ниже. n! = 1*2*3*....*n, (формула вычисления
 * факториала числа n) 0! = 1 (факториал 0 равен 1 (по определению факториала))
 *
 * @author UgaevEugene
 */
public class factorial {

    double value;

    double factorial;

    public factorial() {

        value = 36;

        factorial = 1;

    }

    public void Factorial() {

        for (double i = 1; value >= i; i++) {
            factorial = factorial * i;

        }

        System.out.print(factorial);
    }
}
