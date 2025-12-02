import java.util.Scanner;

public class Input {
    private static Scanner keyboard = new Scanner(System.in);

    public static int readData(String text) {
        System.out.print(text + " 입력 : ");
        return keyboard.nextInt();
    }
}