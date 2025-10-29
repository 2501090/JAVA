import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("점수(score) 입력 : ");
        int score = keyboard.nextInt();

        boolean result = (score >= 80 && score < 90) || (score == 100);

        System.out.println("(score가 80이상 90미만) 이거나 (score가 100)이면 true입니다 : " + result);
    }
}