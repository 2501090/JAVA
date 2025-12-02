public class Compute {

    private static final String[] UNIT = {"", "십", "백", "천"};
    private static final String[] NUM = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    private static final String[] BIG_UNIT = {"", "만 ", "억 ", "조 "}; // 가독성을 위해 공백 추가

    // 4자리 단위(0~9999)를 한글로 변환하는 내부 메소드
    private static String convert4(int part) {
        String subResult = "";
        int val;

        for (int i = 0; i < 4; i++) {
            val = part % 10; // 1의 자리부터 추출
            part /= 10;

            if (val != 0) {
                // 숫자(일~구) + 단위(십~천) + 기존 앞쪽 결과
                subResult = NUM[val] + UNIT[i] + subResult;
            }
        }
        return subResult;
    }

    public static String convertHangul(long money) {
        if (money == 0) return "영원";

        String result = "";
        int bigUnitIdx = 0; // 0:없음, 1:만, 2:억, 3:조

        while (money > 0) {
            int part = (int)(money % 10000); // 뒤에서부터 4자리씩 끊기
            money /= 10000;

            if (part > 0) {
                // 4자리 변환 + 큰 단위(만,억,조) + 기존 상위 결과
                result = convert4(part) + BIG_UNIT[bigUnitIdx] + result;
            }
            bigUnitIdx++;
        }

        return result + "원";
    }
}