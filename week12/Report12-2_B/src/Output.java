public class Output {
    public static void display(int year, int result) {
        String msg = (result == 1) ? "윤년" : "평년";

        System.out.println("--------------------");
        System.out.println(year + "는 " + msg + " 입니다.");
    }
}