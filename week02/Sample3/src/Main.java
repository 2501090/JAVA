import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;
        //데이터입력
        System.out.print("당신의 이름은");
        name = keyboard.nextLine();
        //처리
        System.out.printf("%s님의 나이는?", name);
        age = keyboard.nextInt();
        //출력(필수)
        System.out.printf("%s님의 나이는 %d살입니다.\n", name, age);
    }
}