import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String school = "경복대학교";
        String name = "홍길동";
        int age = 20;
        String gender = "남(여)";
        double height = 170.6;
        double weight = 65.4;

        System.out.printf("학교: %s \n", school);
        System.out.printf("이름: %s \n", name);
        System.out.printf("나이: %d \n", age);
        System.out.printf("성별: %s Cm\n", gender);
        System.out.printf("신장: %f Kg\n", height);
        System.out.printf("체중: %f \n", weight);
    }
}