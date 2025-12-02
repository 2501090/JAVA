public class Main {
    public static void main(String[] args) {

        int year;
        boolean isLeap;

        year = Input.readData("연도");
        isLeap = Compute.leapYear(year);
        Output.display(year, isLeap);
    }
}