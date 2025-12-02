public class Main {
    public static void main(String[] args) {

        long money;
        String result;

        money = Input.readLong("금액");
        result = Compute.convertHangul(money);
        Output.display(money, result);
    }
}