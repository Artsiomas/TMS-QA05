package homework_2.task_5;

// названия пакетов с маленькой буквы
// task_5 -> Task_5
public class Task_5 {
    public static void main(String[] args) {
        double inch; // отсюда убираем
        double cm = 2.54;
        double numberCm;
        // for (int inch = 1; inch < 21; inch++) {
        // 21 - в отдельную переменную
        for (inch = 1; inch < 21; inch++) {
            numberCm = inch * cm;
            System.out.println(inch + " дюйм равен " + numberCm + " сантиметров");
        }
    }
}
