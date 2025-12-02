public class Compute {
    public static boolean leapYear(int year) {
        // (4의 배수이고 100의 배수가 아님) 또는 (400의 배수임)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}