import java.util.Scanner;

public class Task2IfElse {
    public static void main(String[] args) {
        Scanner mNr = new Scanner(System.in);
        System.out.println("Please enter month number");
        int a = mNr.nextInt();

        if (a>0 && a<3) {
            System.out.println("Winter");
        } else if (a>2 && a<6){
            System.out.println("Spring");
        } else if(a>5 && a<9){
            System.out.println("Summer");
        } else if (a>8 && a<12){
            System.out.println("Autumn");
        } else if (a==12){
            System.out.println("Winter");
        } else{
            System.out.println("Please enter number in range 1-12");
        }

    }
}

//a<3 && a>11
//a>8 && a<12
