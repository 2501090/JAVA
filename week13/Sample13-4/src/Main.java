import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String[][] customers = new String[][] {{"1111", "홍길동", "1", ""},
                {"2222", "배정환", "2", ""}, {"3333", "김하나", "3", ""}, {"4444", "이하나", "4", ""},
                {"5555","강하나", "5", ""}, {"6666", "문하나", "2", ""}, {"7777", "윤하나", "4", ""},
                {"8888","박하나", "3", ""}, {"9999", "강하나", "5", ""}, {"1010", "강정환", "1", ""}}; // {번호, 이름 , 타입, 타입 이름}
        int[][] money = new int[customers.length][3];  // {사용금액, 세금, 징수금액}

        Input.preProcess(customers);
        float[] used = Input.readData(customers);

        for (int i = 0; i < money.length; i++) {
            Compute.pay(money[i], customers[i], used[i]);  // 사용 금액 계산
        }

        Compute.tax(customers, money);  // 2차원

        for (int i = 0; i < money.length; i++){
            Compute.total(money[i]);
        }

        Output.display(customers, money, used);
    }
}