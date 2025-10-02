//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 준비물
        int i = 10;
        int j = 5;
        int age = 15;
        int b = 20;
        int cNum = 10; // 3, 5번 문제용 숫자 'c'
        char c = 'c';  // 6번 문제용 문자 'c'
        char ch = 'K';
        int year = 2024;
        boolean powerOn = false;
        String str = "yes";

        // 출력
        System.out.println("1. i가 j로 나누어 떨어진다: " + (i % j == 0));
        System.out.println("2. age는 12보다 작거나 같다: " + (age <= 12));
        System.out.println("3. age는 b보다 작고 c(" + cNum + ")보다 크다: " + (age < b && age > cNum));
        System.out.println("4. age에서 5를 뺀 값은 10과 같다: " + ((age - 5) == 10));
        System.out.println("5. age는 b와 같지 않거나 c(" + cNum + ")와 같다: " + (age != b || age == cNum));
        System.out.println("6. c('" + c + "')가 소문자이다: " + (c >= 'a' && c <= 'z'));
        System.out.println("7. ch('" + ch + "')가 영문자이다: " + ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')));
        System.out.println("8. " + year + "년은 윤년이다: " + ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
        System.out.println("9. 전원이 꺼져있다 (powerOn is false): " + !powerOn);
        System.out.println("10. str 변수의 값이 \"yes\"이다: " + str.equals("yes"));
    }
}