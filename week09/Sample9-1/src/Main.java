//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // **여러번 반복해서 작성**

        // 그냥 여러번 쓰는 방식
        System.out.println("I Love You");
        System.out.println("I Love You");

        System.out.println("--------------");

        // (제어변수, 제어방식, 증감식)
        for (int i = 0; i <= 10; i++) {
            System.out.println("I Love You");
        }
        System.out.println();

        System.out.println("--------------");
        // i는 제어변수
        int i = 0;
        while(i <= 10) {
            System.out.println("I Love You");
            i++;
        }

        System.out.println("--------------");
        //
        System.out.println();
        i = 0;
        do {
            System.out.println("I Love You");
            i++;
        } while (i <= 10);
    }
}