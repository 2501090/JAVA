import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner keyboard = new Scanner(System.in);
                System.out.print("섭씨 온도를 입력하세요: ");
                double celsius = keyboard.nextDouble();

                double fahrenheit = (celsius * 9.0 / 5.0) + 32;

                System.out.printf("해당하는 화씨 온도는 %.1f°F 입니다.", fahrenheit);
    }
}