import java.util.Scanner;

public class Task3OddEven {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("Please enter any number");
        int a = nr.nextInt();

        if (a%2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

    }
}
