import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        Compare compare = new Compare(num1, num2, num3, num4);
        compare.log();

    }
}
