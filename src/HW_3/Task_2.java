package HW_3;

public class Task_2 {
    public static void main(String[] args) {
        int num [] = new int [] {38,8,31,-13,17,78,41,-55,-24,-67};
        int size = num.length;
        double answer = 0;
        double sum = 0;
        for (int i =0; i < size; i++) {
            sum += num[i];
        }
        answer = sum/size;
        System.out.println("Среднее арифмитическое = " + answer + ";");
    }
}
