package homework_3.task_7;

// не забывай форматировать код
public class Task_7 {
    public static void main(String[] args) {
      //  int num [] = {95,56,-45,9,-63,59,40,47,-96,-3};
        int num [] = new int [] {95,56,-45,9,-63,59,40,47,-96,-3};
        int a;
        int b;
        int t;
        int size;
        size = num.length;
        System.out.print("Исходный массив:");
        // старайся выносить логические блоки кода в отдельные методы
        for (int i=0; i < size; i++)
            System.out.print(" " + num [i] + ";");
            System.out.println();

        for (a=1; a < size; a++)
            for (b=size-1; b>=a; b--) {
                if (num[b - 1] > num [b]) {
                    // старайся выносить логические блоки кода в отдельные методы
                    t = num [b-1];
                    num [b-1] = num[b];
                    num [b] = t;
                }
            }

        // старайся выносить логические блоки кода в отдельные методы
        System.out.print("Отсортированный массив:");
        for (int i=0; i < size; i++)
            System.out.print(" " + num [i] + ";");
    }
}
