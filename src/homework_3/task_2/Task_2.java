package homework_3.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int num [] = new int [] {1,2,3,4,5};
        int size = num.length;
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += num[i];
        }
        answer = sum/size;
        System.out.println("Среднее арифметическое = " + answer + ";");
    }
}
