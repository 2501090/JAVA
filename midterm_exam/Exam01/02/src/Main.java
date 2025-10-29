import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("나이(age) 입력 : ");
        int age = keyboard.nextInt();
        System.out.print("연봉(Salary) 입력 : ");
        int Salary = keyboard.nextInt();
        System.out.print("빚(debt) 유무 (true/false) : ");
        boolean debt = keyboard.nextBoolean();

        boolean result = (age >= 25 && age < 40) && (Salary >= 5000) && debt;

        System.out.println("나이(age)가 25세 이상이고 40세 미만이면서, 년봉(Salary)이 5000이상이고, 벗(debt)이 있는 사람인 경우 true입니다 : " + result);
    }
}