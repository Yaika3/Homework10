
public class Main {
    public static void main(String[] args) {

        //task 1
        int[] payments = {100_000, 101_000, 102_000, 103_000, 104_000, 105_000, 106_000, 107_000, 108_000, 109_000, 110_000, 111_000, 112_000, 113_000, 114_000, 115_000, 116_000, 117_000, 118_000, 119_000, 120_000, 121_000, 122_000, 123_000, 124_000, 125_000, 126_000, 127_000, 128_000, 129_000};
        int total = 0;
        for (int i = 0; i < payments.length; i++) {
            total += payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        //task 2
        int maxPayments = 99000;
        {
            for (int i = 0; i < payments.length; i++) {
                if (payments[i] > maxPayments) {
                    maxPayments = payments[i];
                }

            }
            System.out.println("Максимальная сумма трат за день составила " + maxPayments + " рублей.");


        }
        int minPayments = 130_000;
        {
            for (int i = 0; i < payments.length; i++) {
                if (payments[i] < minPayments) {
                    minPayments = payments[i];
                }

            }
            System.out.println("Минимальная сумма трат за день составила " + minPayments + " рублей");
        }

        //task 3
        int averageValue = total / 30;
        {
            System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");

            //task 4 Прочитал про метод import java.util.Arrays; Но не понял куда вставить и как воспользоваться. Так как массив небольшой сделал данным способом.
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            System.out.print(reverseFullName[10]);
            System.out.print(reverseFullName[9]);
            System.out.print(reverseFullName[8]);
            System.out.print(reverseFullName[7]);
            System.out.print(reverseFullName[6]);
            System.out.print(reverseFullName[5]);
            System.out.print(reverseFullName[4]);
            System.out.print(reverseFullName[3]);
            System.out.print(reverseFullName[2]);
            System.out.print(reverseFullName[1]);
            System.out.print(reverseFullName[0]);


        }


    }}






