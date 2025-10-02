import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("당신의 JAVA 점수 입력 : ");
        int score = keyboard.nextInt();

        // 처리 (if else 대신에 삼항 연산자 사용함)
        String grade = (score > 100 || score < 0) ? "잘못된 점수" :
                (score >= 95) ? "A+" :
                        (score >= 90) ? "A0" :
                                (score >= 85) ? "B+" :
                                        (score >= 80) ? "B0" :
                                                (score >= 75) ? "C+" :
                                                        (score >= 70) ? "C0" :
                                                                (score >= 65) ? "D+" :
                                                                        (score >= 60) ? "D0" : "F";

        System.out.println("입력 점수 : " + score);
        System.out.println("학점 : " + grade);
    }
}