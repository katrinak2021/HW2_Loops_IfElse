import java.util.Scanner;

public class Task1Seasons {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter month number");
        int a = myObj.nextInt();

        switch (a) {
            case 1 -> System.out.println("January, winter");
            case 2 -> System.out.println("February, winter");
            case 3 -> System.out.println("March, spring");
            case 4 -> System.out.println("April, spring");
            case 5 -> System.out.println("May, spring");
            case 6 -> System.out.println("June, summer");
            case 7 -> System.out.println("July, summer");
            case 8 -> System.out.println("August, summer");
            case 9 -> System.out.println("September, autumn");
            case 10 -> System.out.println("October, autumn");
            case 11 -> System.out.println("November, autumn");
            case 12 -> System.out.println("December, winter");
            default -> System.out.println("Неверно введен день");
        }
    }

}
