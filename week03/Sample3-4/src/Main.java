//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = "홍길동";
        long age = 21;
        double eye = 1.2f;
        String blood = "O";

        System.out.printf("이름 : %3s\n", name); // %s\n해도 홍길동이 3자리라서 결과는 같다
        System.out.printf("나이 : %d\n", age);
        System.out.printf("시력 : %3.1f\n", eye);
        System.out.printf("혈액형 : %s\n", blood);
    }
}