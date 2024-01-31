package lab;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args){
        num2();
    }
    //Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
    public static void num1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коиличество чисел: ");
        int n = scanner.nextInt();
        String[] nums = new String[n];
        System.out.println("Введите числа: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.next();
        }
        int[] len = new int[n];
        for (int i = 0; i < nums.length; i++){
            int length = nums[i].length();
            len[i] = length;
        }
        System.out.println("Длина элементов массива: ");
        for (int i = 0; i < len.length; i++) {
            int b = len[i];
            System.out.print(" " + b + ";");
        }
        float lenn;
        float sum = 0;
        for(int i = 0; i < len.length; i++){
            sum += len[i];
        }
        lenn = sum/n;
        System.out.println("\n");
        System.out.println("Средняя длина: " + lenn );
        System.out.println("\n");
        System.out.println("Числа, длина которых меньше средней: ");
        for (int i = 0; i < len.length; i++) {
            if(len[i]< lenn){
                for (int j = 0; j < nums.length; j++) {
                    if(i == j ){
                        System.out.print(" " + nums[j]);
                    }
                }
            }
        }

    }
    //Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
    public static void num2(){
        for(int i = 0; i <=100; i++){
            int res = i % 3;
            if(res == 0){
                System.out.println("Данное число делится на 3: " + i);
            }
        }
    }

    //Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
    public static  void num3(){
        int[][] nums = new int[][]
                {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коллическтво сдвигов: ");
        int k = scanner.nextInt();
        int rows = nums.length;
        int columns = nums[0].length;
        int[][] shiftMatr = new int[rows][columns];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int newIndex = (j+k) % columns;
                shiftMatr[i][newIndex] = nums[i][j];
            }
        }
        for (int i = 0; i < shiftMatr.length; i++) {
            for (int j = 0; j < shiftMatr[i].length; j++) {
                System.out.println(shiftMatr[i][j] + " ");
            }
        }
    }
}
