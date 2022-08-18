import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Сумма трат за месяц составила … рублей».
        int totalPayments = 0;
        for (int j : arr) {
            totalPayments += j;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + totalPayments + " рублей.");
        System.out.println();
        //task2
        //Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int MinPayment = 200_001;
        int MaxPayment = 0;
        for (int j : arr) {
            if (j < MinPayment) {
                MinPayment = j;
            }
            if (j > MaxPayment) {
                MaxPayment = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + MinPayment + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + MaxPayment + " рублей.");
        System.out.println();
        //task3
        //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за
        // месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц
        // составила … рублей».
        double avrPayments = totalPayments * 1.0 / arr.length;
        String str = String.format("Средняя сумма трат за месяц составила %.2f рублей.", avrPayments);
        System.out.println(str);
        System.out.println();
        //task4
        //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и ФИО. сотрудников начали отображаться
        // в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        //Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве
        // данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено "Ivanov Ivan".

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
