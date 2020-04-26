package homework_3.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int num[] = new int[]{95, 56, 45, 9, 63, 59, 40, 47, 96, 3};

        int a = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2 == 0) {
                a++;
            }
        }
        int[] num_2 = new int[a];
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2 == 0) {
                num_2[index] = num[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(num_2));
    }
}