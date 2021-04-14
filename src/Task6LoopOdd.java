public class Task6LoopOdd {
    public static void main(String[] args) {
        for (int a = 0; a<100; a++){
            if (a%2 == 0){
                continue;
            } else {
                System.out.println(a);
            }

        }
    }
}
