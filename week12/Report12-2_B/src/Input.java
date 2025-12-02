import java.util.Scanner;

public class Input {
    private static Scanner keyboard = new Scanner(System.in);

    public static int readData(String text) {
        System.out.print(text + " : ");
        return keyboard.nextInt();
    }
}