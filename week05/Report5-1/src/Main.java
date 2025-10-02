import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("하나의 영문자 입력: ");
        char ch = keyboard.next().charAt(0);

        // 처리
        // 1. 먼저 입력된 문자가 영문자인지 확인합니다.
        String result = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ?
                // 2. 영문자가 맞다면, 다시 소문자인지 확인합니다.
                ((ch >= 'a' && ch <= 'z') ?
                        // 3. 소문자일 경우의 출력 문자열
                        "입력 문자 " + ch + "는 소문자이고, 대문자로 변경하면 " + (char)(ch - 32) + " 입니다." :
                        // 4. 대문자일 경우의 출력 문자열
                        "입력 문자 " + ch + "는 대문자이고, 소문자로 변경하면 " + (char)(ch + 32) + " 입니다."
                ) :
                // 5. 영문자가 아닐 경우의 출력 문자열
                "영문자가 아닙니다.";

        // 최종 결과 문자열을 출력합니다.
        System.out.println(result);
    }
}