
/**
 *
 * @author UgaevEugen
 */
import LessonThreeStep.HorizontalLine;
import LessonThreeStep.SumOddIntegers;
import LessonThreeStep.factorial;
import LessonFourStep.ReverseNumber;
import LessonSixStep.ArrayOne;

public class main {

    public static void main(String[] agrs) {

        //ArrayOne foo = new ArrayOne(); 
        //foo.ShowArray();
        int mass[] = {1, 2, 3, 6, 10};
        int SumEven = 0;
        int SumNotEven = 0;

        boolean SumEvenBool = true;
        boolean SumNotEvenBool = true;

        for (int i = 0; i < mass.length; i++) {

            SumEvenBool = (mass[i] % 2 == 0);
            if (SumEvenBool) {
                SumEven = SumEven + mass[i];
            }

            SumNotEvenBool = (mass[i] % 2 == 1);
            if (SumNotEvenBool) {
                SumNotEven = SumNotEven + mass[i]; 
            }
        }

        System.out.println(SumEven);
        System.out.print(SumNotEven);
    }
}
