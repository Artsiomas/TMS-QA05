package homework_4.task_3;

import homework_4.task_1.MyClass;


public class Task_3 {
    public static void main(String[] args) {
        MyClass[] arrayHuman = new MyClass[4];

        arrayHuman [0] = new MyClass(20, "Артем");
        arrayHuman [1] = new MyClass(21, "Артем");
        arrayHuman [2] = new MyClass(20, "Артем");
        arrayHuman [3] = new MyClass(20, "Артем");

        int num = 0;

        for (int i = 0; i<arrayHuman.length; i++) {
            for (int a = i + 1; a<arrayHuman.length; a++) {
                if (arrayHuman[i].equals(arrayHuman[a])) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
