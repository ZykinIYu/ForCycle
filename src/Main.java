import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = 0;

        System.out.print("Введите целое не отрицательное число: ");
        value = new Scanner(System.in).nextInt();

        if (value == 0) {
            System.out.println("Введено цисло 0, вычислять нечего");
        }

        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                System.out.println(i + " * " + value / i);
            }
        }
    }
}
