import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mid, fin, quiz, report, attend;

        System.out.print("중간 : ");
        mid = scanner.nextInt();
        System.out.print("기말 : ");
        fin = scanner.nextInt();
        System.out.print("퀴즈 : ");
        quiz = scanner.nextInt();
        System.out.print("과제 : ");
        report = scanner.nextInt();
        System.out.print("출석 : ");
        attend = scanner.nextInt();

        double simpleAvg = (mid + fin + quiz + report + attend) / 5.0;

        double weightedAvg = (mid * 0.15) + (fin * 0.15) + (quiz * 0.10) + (report * 0.40) + (attend * 0.20);

        System.out.printf("단순 평균 : %.2f\n", simpleAvg);
        System.out.printf("가중치 평균 : %.2f\n", weightedAvg);
    }
}