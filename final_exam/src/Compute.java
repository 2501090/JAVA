public class Compute {

    // [짝수 규칙] 총점: 매개 변수로 '전체 학생(3차원 배열)' 사용
    public static void calcTotal(int[][][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                int sum = 0;
                // 4과목(국,영,수,선택) 합산
                for (int k = 0; k < 4; k++) sum += score[i][j][k];
                score[i][j][4] = sum;
            }
        }
    }

    public static void calcAvg(int[][] classScore, float[] classAvg) {
        for (int i = 0; i < classScore.length; i++) {
            classAvg[i] = classScore[i][4] / 4.0f;
        }
    }

    public static void calcRank(int[][][] score) {
        // 초기화
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j][5] = 1; // 반석차
                score[i][j][6] = 1; // 학년석차
            }
        }

        // 비교 (나보다 잘한 사람 수만큼 등수 증가)
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                for (int x = 0; x < score.length; x++) {
                    for (int y = 0; y < score[x].length; y++) {
                        if (score[i][j][4] < score[x][y][4]) {
                            score[i][j][6]++; // 학년석차 증가
                            if (i == x) score[i][j][5]++; // 같은 반이면 반석차 증가
                        }
                    }
                }
            }
        }
    }

    // 반 통계 계산
    public static void calcClassStats(float[][] avg, String[][] notes, float[] classTotalAvgs) {
        for (int i = 0; i < avg.length; i++) {
            // 반 전체 평균 구하기
            float sum = 0;
            for (float a : avg[i]) sum += a;
            float currentClassAvg = sum / avg[i].length;
            classTotalAvgs[i] = currentClassAvg;

            // '반평균 미만' 여부 확인하여 notes 배열 채우기
            for (int j = 0; j < avg[i].length; j++) {
                if (avg[i][j] < currentClassAvg) {
                    notes[i][j] = "반평균 미만";
                } else {
                    notes[i][j] = "";
                }
            }
        }
    }
}