import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("시간 입력 (예: 3.76) : ");
        double time = keyboard.nextDouble();

        // 1. 입력받은 시간을 총 초 단위로 변환
        int totalSeconds = (int) (time * 3600);

        // 2. 일(day) 계산 (1일 = 86400초)
        int day = totalSeconds / 86400;
        int remainSeconds = totalSeconds % 86400; // 날짜 계산 후 남은 초

        // 3. 시간(hour) 계산 (1시간 = 3600초)
        int hour = remainSeconds / 3600;
        remainSeconds = remainSeconds % 3600; // 시간 계산 후 남은 초

        // 4. 분(minute) 계산 (1분 = 60초)
        int minute = remainSeconds / 60;

        // 5. 초(second) 계산
        int second = remainSeconds % 60;

        // 6. 출력
        System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다\n",
                time, day, hour, minute, second);
    }
}