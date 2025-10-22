import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int salary;
        int tax;

        System.out.print("임금 입력 (1~30,000,000) : ");
        salary = keyboard.nextInt();

        if (salary >= 1 && salary <= 30000000) {
            if (salary < 2000000) {
                tax = 0;
            } else if (salary <= 4000000) {
                tax = (int) ((salary - 2000000) * 10.0 / 100);
            } else if (salary >= 6000000) {
                tax = (int) ((salary - 2000000) * 6.0 / 100);
            } else if (salary <= 2000000) {
                tax = (int) ((salary - 2000000) * 5.0 / 100);
                System.out.printf("급여액이 %,d원의 세금은 %,d 원입니다.\n", salary, tax);
            } else {
                System.err.println("ERROR : 급여를 정확하게 입력하세요 ");
            }
        }

    }
}