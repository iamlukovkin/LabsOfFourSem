//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
import java.util.Scanner;

public class Values {
    private final double[] values;
    private final int count;

    public Values() {
        System.out.println("Введите количество чисел:");
        Scanner scanner = new Scanner(System.in);
        this.count = scanner.nextInt();
        values = new double[this.count];
    }

    public void setRandomValues() {
        for (int i = 0; i < count; i++) {
            values[i] = Math.random();
        }
    }

    public void inputValues() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("Введите " + (i + 1) + " число:");
            values[i] = scanner.nextDouble();
        }
    }

    public double[] getValues() {
        return values;
    }

    public static void printValuesWithoutNewLine(double[] values) {
        for (int i = 0; i < values.length; i++)
            System.out.print(i + 1 + ": " + values[i] + " ");
        System.out.println();
    }

    public  static void printValuesWithNewLine(double[] values) {
        System.out.println();
        for (int i = 0; i < values.length; i++)
            System.out.println(i + 1 + ": " + values[i]);
    }

    public void printValuesDivisibleBy5And7() {
        System.out.println("Числа делящиеся на 5 и 7:");
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 5 == 0 && values[i] % 7 == 0)
                System.out.println(i + 1 + ": " + values[i]);
        }
    }
}
