import java.util.Scanner;

public class Task5Rainbow {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter colour number");
        int a = myObj.nextInt();

        switch (a){
        case 1 -> System.out.println("Red");
        case 2 -> System.out.println("Orange");
        case 3 -> System.out.println("Yellow");
        case 4 -> System.out.println("Green");
        case 5 -> System.out.println("Light blue");
        case 6 -> System.out.println("Blue");
        case 7 -> System.out.println("Violet");
            default -> System.out.println("Please enter number in range 1-7. Thank you!");

    }
}
}
