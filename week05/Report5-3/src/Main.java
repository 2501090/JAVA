//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 문제에서 주어진 전체 초
        int totalSeconds = 54321;

        // 1. 시간 계산 (1시간 = 3600초)
        int hours = totalSeconds / 3600;
        // 2. 시간을 계산하고 남은 초 계산
        int remainingSeconds = totalSeconds % 3600;
        // 3. 분 계산 (1분 = 60초)
        int minutes = remainingSeconds / 60;
        // 4. 최종 초 계산
        int seconds = remainingSeconds % 60;
        // 결과 출력
        System.out.println(totalSeconds + " 초 = " + hours + " 시간 " + minutes + " 분 " + seconds + " 초");
    }
}