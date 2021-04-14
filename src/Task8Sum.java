import java.util.Scanner;

public class Task8Sum {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Пожалуйста, введите любое целое положительное число");
        int a = numbers.nextInt();

        if (a < 0) {
            System.out.println("Пожалуйста, введите положительное число");
        } else {

            int sum = 0;
            int i = 1;
            while (i < a + 1) {
                sum = sum + i;
                ++i;
                System.out.println("Пошаговый промежуточный результат = " + sum);
            }
            System.out.println("Конечный результат суммирования = " + sum);


        }
    }
}
