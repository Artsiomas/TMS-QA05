package homework_4.task_1;

import java.util.Objects;

public class MyClass { // MyClass - думаю стоит подумать над другим названием
    private static String text = "Hello form static";

    private int age;
    private String name;

    public MyClass() {
        name = "No name";
        age = 15;
    }

    public MyClass(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }// абзац
    public int getAge () {
        return age;
    }// абзац
    void showName() {
        System.out.println("Имя: " + name + "; Возраст: " + age);
    }// абзац
    public String showResult() {
        return "Имя: " + name + ", Возраст:" + age;
    }// абзац
    public String getText () {
        return text;
    }// абзац
    public void setText (String text) {
        this.text= text;
    }

    public String showText () {
        return "Значение строки: " + text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyClass Human = (MyClass) o;
        return Objects.equals(name, Human.name) &&
                Objects.equals(age, Human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
