import java.util.Objects;
import java.util.Scanner;

public class EnterAValue {
    public static void main(String[] args) {
        double courseUsd = 93.75, courseRub = 1 /courseUsd, usd, rub;
        int currencyPair = 0;
        String quitOrContinue = "";
        do {
            System.out.println("Выберите пару валют для конвертации:");
            System.out.println("<1> для пары USD/RUB" + "\n" + "<2> для пары RUB/USD");
            currencyPair = new Scanner(System.in).nextInt();
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
            } else {
                System.out.println("Введено неверное значение");
            }
            System.out.println("\n" + "Для завершения введите <Q>");
            System.out.println("Для продолжения введите <Пробел>");
            quitOrContinue = new Scanner(System.in).nextLine();
        } while (!Objects.equals(quitOrContinue, "q") && !Objects.equals(quitOrContinue, "Q"));
    }
}



//TODO: none
//FIXME:
// - значение курса валют брать с сервера
// - добавить новые валюты
// - исправить вылеты программы при неверном вводе значений