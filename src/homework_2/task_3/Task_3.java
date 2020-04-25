package homework_2.task_3;

// названия пакетов с маленькой буквы
// task_3 -> Task_3
public class Task_3 {
    public static void main(String[] args) {

        int number, sum;
        // int sum = 0;
//        for (int number = 1; number < 256; number = number * 2); и далее тело цикла
        for ( number = 1, sum = 0; number < 256; number = number * 2, sum =sum + number );
        System.out.println("Сумма: " + sum);
    }
}
