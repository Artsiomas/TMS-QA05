package homework_3.task_4;


public class task_4 {
    public static void main(String[] args) {
        int num[][] = new int[10][10];
        int size = num.length;
        int a = 1;
        int b = 1;
        int i = 1;
        
        /*
        for (int i = 0; i < size; i++) {
            for (int b = 0; b < size; b++) {
                num[i][b] = (i + 1) * (b + 1);
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }
        
        примерно так долнжа выглядить программа, не стоит использовать if и фактические цифры для заполнения
        подумай что будет, если появится необходимость увеличить размер таблицы, в твоем вариант надо будет дописать код
        */ 
        for ( i = 1; i < size; i++) {
            for (b = 1; b<size; b++) {
                if (i == 1) num[1][b] = a * b;
                if (i == 2) num[2][b] = a * b * 2;
                if (i == 3) num[3][b] = a * b * 3;
                if (i == 4) num[4][b] = a * b * 4;
                if (i == 5) num[5][b] = a * b * 5;
                if (i == 6) num[6][b] = a * b * 6;
                if (i == 7) num[7][b] = a * b * 7;
                if (i == 8) num[8][b] = a * b * 8;
                if (i == 9) num[9][b] = a * b * 9;
                System.out.print(num[i][b]+ " ");
            }
            System.out.println();
        }
    }
}
