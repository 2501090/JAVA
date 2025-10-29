import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("정수 x, y, z 입력 : ");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int z = keyboard.nextInt();

        boolean result = (x > 10 && x < 20) || (y > 10 && y < 20) || (z > 10 && z < 20);
        System.out.println("세 변수(x,y,z)중 하나라도 10과 20사이에 있는가? : " + result);
    }
}