import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final double PI = 3.141592;

        System.out.print("구의 반지름(r)을 정수로 입력 : ");
        int r = keyboard.nextInt();

        double volume = (4.0 / 3.0) * PI * r * r * r;
        double surfaceArea = 4 * PI * r * r;

        System.out.printf("구의 부피: %.2f\n", volume);
        System.out.printf("구의 표면적: %.2f\n", surfaceArea);
    }
}