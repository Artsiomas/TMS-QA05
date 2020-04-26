package homework_3.task_3;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        // int[] num = {66,56,89,3,26,58,44,92};
        int [] num = new int [] {66,56,89,3,26,58,44,92};
        int size = num.length;
        for (int i = 0; i < size; i++) {
            if (i/2 == 1) { // i % 2 != 0
                num[i] = 0;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
