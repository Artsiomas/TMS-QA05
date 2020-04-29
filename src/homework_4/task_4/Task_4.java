package homework_4.task_4;

import homework_4.task_1.MyСlass;

public class Task_4 {
    public static void main(String[] args) {
        MyСlass human = new MyСlass ();
        MyСlass human_1 = new MyСlass ();
        MyСlass human_2 = new MyСlass ();
        MyСlass human_3 = new MyСlass ();

        human.setText("Другое значение");
        System.out.println(human_1.showText());
        System.out.println(human_2.showText());
        System.out.println(human_3.showText());
    }
}
