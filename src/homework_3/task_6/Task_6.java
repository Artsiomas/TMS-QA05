package homework_3.task_6;

import java.util.Arrays;

// не забывай форматировать код
public class Task_6 {
    public static void main(String[] args) {
        int num[] = new int[]{95, 56, 45, 9, 63, 59, 40, 47, 96, 3};

        int a = 0; // плохое название переменной
        // старайся выносить логические блоки кода в отдельные методы
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2 == 0) {
                a++;
            }
        }
        int[] num_2 = new int[a]; // плохое название переменной
        int index = 0;
        // старайся выносить логические блоки кода в отдельные методы
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2 == 0) {
                num_2[index] = num[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(num_2));
    }
}
