import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("나이(age) 입력 : ");
        int age = keyboard.nextInt();
        System.out.print("점수(score) 입력 : ");
        int score = keyboard.nextInt();

        String result = (age >= 18 && score >= 80) ? "합격" : (age < 18 || score < 50) ? "불합격" : "재시험";

        System.out.println("나이(age)가 18세 이상이고 점수가 80점 이상이면 합격, 나이가 18세 미만이거나 점수가 50점 미만이면 불합격, 그 외에는 재시험입니다 : " + result);
    }
}