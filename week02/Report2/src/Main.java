import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double radius = 0;
        double boxArea = 0;
        double circleArea = 0;
        double area = 0;

        System.out.println("원의 반지름 : ");
        radius = keyboard.nextDouble();

        double sideLength = radius * 2;
        boxArea = sideLength * sideLength;
        circleArea = 3.141592 * radius * radius;
        area = boxArea - circleArea;

        System.out.printf("원의 반지름: %.2f\n", radius);
        System.out.printf("정사각형 면적: %.2f Cm2\n", boxArea);
        System.out.printf("원의 면적: %.2f Cm2\n", circleArea);
        System.out.printf("구하고자 하는 면적: %.2f Cm2\n", area);
    }
}