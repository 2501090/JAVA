import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keybaoard = new Scanner(System.in);
        int data = 0;
        String result = "";

        System.out.printf("정수 입력 : ");
        data = keybaoard.nextInt();

        result = data > 0 ? "양수" : ((data == 0) ? "영" : "음수");

        System.out.printf("%d는 %s입니다.\n", data, result);
    }
}