public class Compute {
    public static int leapYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // 윤년이면 1, 평년이면 0 반환
        return isLeap ? 1 : 0;
    }
}