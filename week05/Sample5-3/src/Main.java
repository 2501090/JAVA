//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ** 단축 연산 **

        boolean test = 'a' + 1 > 'A' && 'A' > 'B'; // 'b' > 'A' -> true &&(*) false  -> false
        boolean test1 = 'a' + 1 > 'A' || 'A' > 'B'; // 'b' > 'A' -> true || false  -> true

        int a = 5;

        boolean test2 = 5 > 3 && a++ != 0; // ((5 > 3) && ((a++) != 0)) | true * true - true a = 6
        boolean test3 = 2 > 3 && a++ != 0; // ((2 > 3) && ((a++) != 0)) | false * ? - false a = 6
        // ++a 로 바꿔도 ?면 계산안해서 상관없어짐

        System.out.printf("test = %b\n", test);
        System.out.printf("test1 = %b\n", test1);
        System.out.printf("test2 = %b, a = %d\n", test2, a);
        System.out.printf("test3 = %b, a = %d\n", test3, a);

    }
}