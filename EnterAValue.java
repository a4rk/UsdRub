import java.util.Scanner;

public class EnterAValue {
    public static void main(String[] args) {
        double courseUsd = 93.75, courseRub = 1 /courseUsd, usd, rub;
        System.out.println("Выберите пару валют для конвертации");
        System.out.println("<1> для пары USD/RUB" + "\n" +"<2> для пары RUB/USD");
        int currencyPair = new Scanner(System.in).nextInt();
        correctTheValue:
            if (currencyPair == 1) {
                System.out.println("Введите значение в USD");
                usd = new Scanner(System.in).nextDouble();
                rub = usd * courseUsd;
                System.out.println(usd + " S" + " = " + rub + ' ' + "RUB");
            } else if (currencyPair == 2) {
                System.out.println("Введите значение в RUB");
                rub = new Scanner(System.in).nextDouble();
                usd = rub * courseRub;
                System.out.println(rub + " RUB" + " = " + usd + " $");
            }
            else {
                // TODO: continue correctTheValue;  должно перенаправить на указанную метку
            }
    }
}




//FIXME:
// - значение курса валют брать с сервера
// - добавить новые валюты