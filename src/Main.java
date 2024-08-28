public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        // Задача 1
        int[] payments = new int[5];
        payments[0] = 54000;
        payments[1] = 49000;
        payments[2] = 52990;
        payments[3] = 50456;
        payments[4] = 49348;
        int sum = 0;

        // 1 вариант
        for (int i = 0; i < payments.length; i++) {
            sum += payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // 2 вариант
//        for (int element : payments) {
//            sum += element;
//        }
//        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("Задача 2");
        // Задача 2
        int[] paymentsOne = new int[5];
        paymentsOne[0] = 55000;
        paymentsOne[1] = 49400;
        paymentsOne[2] = 52990;
        paymentsOne[3] = 52456;
        paymentsOne[4] = 50348;
        int min = 100000;
        int max = 0;
        for (int i = 0; i < paymentsOne.length; i++) {
            if (paymentsOne[i] > max) {
                max = paymentsOne[i];
            }
            if (paymentsOne[i] < min) {
                min = paymentsOne[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");


        System.out.println("Задача 3");
        // Задача 3
        int[] paymentsSecond = new int[5];
        paymentsSecond[0] = 67340;
        paymentsSecond[1] = 50300;
        paymentsSecond[2] = 54990;
        paymentsSecond[3] = 32456;
        paymentsSecond[4] = 44348;
        int sum2 = 0;
        double averageValue;
        for (int elements : paymentsSecond) {
            sum2 += elements;
        }
        averageValue = sum2 / 5D;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");


        System.out.println("Задача 4");
        // Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
