package homework_4.task_1;

public class MyСlass {
    private static String text = "Hello form static";

    private int age;
    private String name;

    public MyСlass() {
        name = "No name";
        age = 15;
    }

    MyСlass(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }
    public int getAge () {
        return age;
    }

    void show() {
        System.out.println(name + ": " + age);
    }
    public String getText () {
        return text;
    }
    public void setText (String text) {
        this.text= text;
    }

    public String showText () {
        return "Значение строки: " + text;
    }
}
