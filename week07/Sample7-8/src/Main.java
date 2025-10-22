import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int hours;
        String result;
        int salary;
        int extra;

        System.out.print("주당 근무시간 입력 : ");
        hours = keyboard.nextInt();

        if (hours > 40) {
            salary = 11500 * hours;
            extra = 0;
            result = String.format("급여는 %,d원 입니다.", salary);
        } else {
            salary = 11500 * 40;
            extra = (int) (11500 * 1.5) * (hours - 40);
            result = String.format("초과 수당 %,d원과 급여 %,d를 합한 %,d원 입니다.",extra ,salary, extra + salary);
        }

        System.out.printf("%d 시간의 아르바이트 급여는 %s.\n", hours, result);
    }
}