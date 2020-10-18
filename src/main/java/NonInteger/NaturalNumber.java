/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonInteger;

/**
 *
 * @author UgaevEugene Дано натуральное число а (a<100). Напишите программу,
 * выводящую на экран количество цифр в этом числе и сумму этих цифр
 */
public class NaturalNumber {

    int Number, Sum;

    NaturalNumber() {

        Number = 100019;
        Sum = 0;

    }

    // Возврат суммы чисел
    int Natural() {

        for (int i = 0; i <= Number; i++) {

            //System.out.println(i);
            Sum = Sum + i;

        }

        return Sum;
    }

    //Возврат количество цифр
    int Amount() {

        //Реализовать проверку на розрядность числа
        //Реализована проверка до миллиона
        if (Number < 9) {
            return 1;

        } else {

            if (Number < 100) {
                return 2;
            } else {
                if (Number < 1000) {
                    return 3;
                } else {

                    if (Number < 10000) {
                        return 4;
                    } else {
                        if (Number < 100000) {
                            return 5;
                        } else {
                            if (Number < 1000000) {
                                return 6;
                            }
                        }
                    }
                }
            }

        }

        return Number;
    }

}
