import java.text.DecimalFormat;

public class Output {
    public static void display(long money, String result) {
        // 3자리마다 콤마 찍기 위한 포맷터
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("--------------------");
        System.out.println(df.format(money) + "는 " + result);
    }
}