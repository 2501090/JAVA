public class Main {
    public static void main(String[] args) {

        int year;
        int check; // 0 or 1

        year = Input.readData("연도");
        check = Compute.leapYear(year);
        Output.display(year, check);
    }
}