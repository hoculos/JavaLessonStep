
package LessonFourStep;

/**
 *
 * @author EugeneUgaev
 */
public class ReverseNumber {

    public int Number() {

        int foo = 1203;
        String str = Integer.toString(foo);

        char[] arrStr = str.toCharArray();

        int count;

        count = arrStr.length;

        String result = null;

        for (int i = count - 1; i >= 0; i--) {

            result = result + arrStr[i];

        }
        //System.out.print(result.substring(4));
       Integer i2 = 0;
        try {
            i2 = Integer.valueOf(result.substring(4));
            System.out.println(i2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
        return i2;
    }

}
