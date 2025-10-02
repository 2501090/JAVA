import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 사용자로부터 구매 금액 입력받기
        System.out.print("구매 금액을 입력하세요: ");
        int price = scanner.nextInt();
        // 사용자로부터 멤버십 여부 입력받기
        System.out.print("멤버십 회원이신가요? (y/n): ");
        // 입력받은 문자열의 첫 글자를 가져와 소문자로 변경
        char memberInput = scanner.next().toLowerCase().charAt(0);
        boolean member = (memberInput == 'y');

        // 무료배송 조건 확인
        // 조건 1: 구매 금액이 5만원 이상
        // 조건 2: 멤버십 회원이면서 구매 금액이 3만원 이상
        boolean isFree = (price >= 50000) || (member && price >= 30000);
        // 입력 정보 출력
        System.out.println("\n--- 확인 ---");
        System.out.println("구매 금액: " + price + "원");
        System.out.println("멤버십 여부: " + (member ? "회원" : "비회원"));

        // 최종 결과 출력
        if (isFree) {
            System.out.println("결과: 무료배송이 적용됩니다.");
        } else {
            System.out.println("결과: 배송비가 부과됩니다.");
        }
    }
}