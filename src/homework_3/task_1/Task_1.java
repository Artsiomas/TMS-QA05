package homework_3.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве: ");
        int a = scanner.nextInt();
        int[] massive = new int[a];
        int max = massive[0];
        int min = massive[0];
        int i = 0;
        int sum = 0;
        int size = massive.length;

        for (int element = 0; element < size; element++) {
            System.out.print("Введите число " + (i + 1) + "-ый элемент массива: ");
            massive [element] = scanner.nextInt();
            System.out.println(massive[element] + ";");
            i++;
            sum += massive [element];

            if (massive[element] > max)
                max = massive[element];

            if (massive[element] < min)
                min = massive[element];
            // не понимаю почему min работает не правильно, т.е. он выводит всегда число 0, а не минимально введенное пользователем
        }
        System.out.println("Сумма ваших чисел равна: " + sum + ";");
        System.out.println("Максимальное число равно: " + max + ";");
        System.out.println("минимальное число равно: " + min + ";");
    }
}

