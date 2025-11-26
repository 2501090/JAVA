import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner keyboard = new Scanner(System.in);
        int first, second;
        int result;

        Output.display(); // call by
        first = Input.readData("첫번째 데이터 :"); // call by value
        second = Input.readData("두번째 데이터 :");

        /* System.out.print("첫번째 정수 입력 : ");
        first = keyboard.nextInt();
        System.out.print("두번째 정수 입력 : ");
        second = keyboard.nextInt(); */

        // result = first + second;

        result = Compute.add(first,second);
        Output.display(first,second,result);
        // System.out.printf("%d + %d = %d\n", first, second, result);
        Output.display();
    }

}