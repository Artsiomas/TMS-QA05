package homework_3.task_5;

// не забывай форматировать код
public class Task_5 {
    public static void main(String[] args) {
        // int num[] = {10,20,30,40};
        int num[] = new int [] {10,20,30,40};
        int size = num.length;
        int a = size - 1;
        int i;
        // старайся выносить логические блоки кода в отдельные методы
        for ( i = 0; i < size/2; i++) {
            int buffer = num[i];
            num[i] = num [a];
            num[a] = buffer;
            a--;
        }
        // старайся выносить логические блоки кода в отдельные методы
        for ( i = 0; i<size; i++) {
            System.out.print( num[i] + " ");
        }
    }
}
