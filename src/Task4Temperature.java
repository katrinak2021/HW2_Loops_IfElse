import java.util.Scanner;

public class Task4Temperature {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Пожалуйста, введите температуру");
        int a = temp.nextInt();

        if (a <= -20){
            System.out.println("Холодно");
        } else if (a > -20 && a <= -5){
            System.out.println("Нормально");
        } else if (a > -5){
            System.out.println("Тепло");
        }
    }
}
