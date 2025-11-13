import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ip = new int[4];
        int nogood = 0;
        int n = 0;
        int xdata;

        System.out.print("1 ~ 4번 중 한 후보의 번호를 입력_");

        while (scanner.hasNextInt()) {
            xdata = scanner.nextInt();
            n++;

            if (xdata >= 1 && xdata <= 4) {
                ip[xdata - 1]++;
            } else {
                nogood++;
            }
            System.out.print("1 ~ 4번 중 한 후보의 번호를 입력_");
        }

        System.out.println("\n득표수");
        System.out.println("------");
        for (int i = 0; i < ip.length; i++) {
            System.out.println((i + 1) + "번 : " + ip[i] + "표");
        }
        System.out.println("무효표 : " + nogood + "표");
        System.out.println("\n총 " + n + "표");
    }
}