import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int kor, eng, math;
        double avg;
        char grade;
        String result;

        System.out.print("국어, 영어, 수학 점수는 ? ");
        kor = keyboard.nextInt();
        eng = keyboard.nextInt();
        math = keyboard.nextInt();

        avg = (kor + eng + math) / 3.0;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        if (avg >= 80) {
            result = "성적 양호";
        } else if (avg >= 60) {
            result = "노력";
        } else {
            result = "성적 불량";
        }

        System.out.println("국어\t영어\t수학\t평균\t학점\t결 과");
        System.out.printf("%d\t%d\t%d\t%.2f\t%c\t%s\n",
                kor, eng, math, avg, grade, result);
    }
}