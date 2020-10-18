/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonInteger;

/**
 *
 * @author UgaevEugene
 */
public class NonInteger {

    /*
    public int AlterNonInteger(){ 
//Альтернативная реализация строками, на основе сравнения
 public static int NonIntegerAlternative(char result){
       
      String str = "5.12376";
      
        int ind1, ind2, def = 0;
        
        ind1 = str.indexOf('.'); // функция нахождения символа 
        ind2 = str.indexOf(',');
               
        if (ind1 >def){
        System.out.println("Found '.'");
        }else if(ind2 >def) {
            System.out.println("Found ','");
        }else{
            int Res; 
            Res = str.length() - 1; //Нашли кол-во символов, - 1 индекс строк в Java начинаются с нуля.
            result = str.charAt(Res); //Кол-во символов есть индекс последнего символа
            System.out.println("This number Integer: " + result);
        }
  
        switch (result) {
            case '0':
                System.out.println("This number Integer: " + result);
                break;
            case '2':
                System.out.println("This number Integer: " + result);
                break;
            case '4':
                System.out.println("This number Integer: " + result);
                break;
            case '6':
                System.out.println("This number Integer: " + result);
                break;
            case '8':
                System.out.println("This number Integer: " + result);
                break;
            default:
                System.out.println("This number is not Inetger: " + result);
                break;
        }
        
        return result; 
    }
}

    
}
     */

    public static int NonInteger() {

        int Number, Inc;

        Number = 1503;
        Inc = Number;

        Number = Number % 2;

        if (0 == Number) {

            System.out.println("This number is Devisible " + Number);

        } else {
            System.out.println("This number is NOT Devisible " + Number);
        }

        return Inc;
    }

}
