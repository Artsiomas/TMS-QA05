package homework_4.task_4;

import homework_4.task_1.MyClass;

// форматируй код
public class Task_4 {
    public static void main(String[] args) {

 MyClass human = new MyClass ();

        MyClass human_1 = new MyClass (); // названия переменных так себе
        MyClass human_2 = new MyClass ();
        MyClass human_3 = new MyClass ();

        human.setText("Другое значение");
        System.out.println(human_1.showText());
        System.out.println(human_2.showText());
        System.out.println(human_3.showText());
    }
}
