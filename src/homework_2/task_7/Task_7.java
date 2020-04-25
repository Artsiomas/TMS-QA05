package homework_2.task_7;

// названия пакетов с маленькой буквы
// task_7 -> Task_7
public class Task_7 {
    public static void main(String[] args) {

        int number, sum;
        // int sum = 0;
        // for (int number = 1; number <100; number = number +2) {тело цикла}
        for ( number = 1, sum = 0; number <100; number = number +2, sum =sum + number );
        System.out.println("Сумма: " + sum);
    }
}
