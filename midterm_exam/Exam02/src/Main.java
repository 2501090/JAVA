import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("나이(age) 입력 : ");
        int age = keyboard.nextInt();

        int result = (age >= 18) ? 4000 :
                (age >= 13) ? 3000 :
                        (age >= 7) ? 1000 : 0;

        System.out.printf("나이 %d세의 입장료는 %,d원 입니다.\n", age, result);
    }
}