//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int well = 300; // 우물 깊이
        int limit = 7;  // 제한 시간
        int up = 55;    // 낮 상승
        int down = 13;  // 밤 하강

        int height = 0; // 현재 높이
        boolean success = false; // 성공 여부

        for (int day = 1; day <= limit; day++) {
            height = height + up; // 낮

            if (height >= well) {
                System.out.printf("%d일 만에 탈출에 성공했습니다.\n", day);
                success = true; // 성공으로 표시
                break; // 반복문 탈출
            }

            height = height - down; // 밤
        }

        if (success == false) {
            System.out.printf("%d일 안에 탈출에 실패했습니다.\n", limit);
        }
    }
}