package HW_3;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int [] num = new int [] {66,56,89,3,26,58,44,92};
        int size = num.length;
        for (int i = 0; i < size; i++) {
            if (i/2 == 1) {
                num[i] = 0;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
