public class Output {
    // 모든 데이터(점수, 평균, 비고, 반평균)를 Main에서 받아서 출력만 함
    public static void display(String[][][] students, int[][][] score, float[][] avg, String[][] notes, float[] classTotalAvgs) {
        float totalSchoolAvgSum = 0;
        int totalStudentCount = 0;

        for (int i = 0; i < students.length; i++) {
            // 헤더 출력
            System.out.println("\n                  *** " + (i + 1) + "반 성적표 ***");
            printLine();
            System.out.println("학번      이름    국어  영어  수학  선택  총점  평균  반석차  학년석차 비고");
            printLine();

            // 학생 정보 출력
            for (int j = 0; j < students[i].length; j++) {
                System.out.printf("%-9s %-5s %3d %3d %3d %3d %3d %6.2f %3d %5d %s\n",
                        students[i][j][0], students[i][j][1],
                        score[i][j][0], score[i][j][1], score[i][j][2], score[i][j][3],
                        score[i][j][4], avg[i][j],
                        score[i][j][5], score[i][j][6],
                        notes[i][j] // Compute에서 결정된 비고 출력
                );
            }
            printLine();
            // 반 전체 평균 출력
            System.out.printf("%d반 전체 평균: %.2f\n", (i + 1), classTotalAvgs[i]);

            // 학년 평균을 위한 단순 누적
            totalSchoolAvgSum += (classTotalAvgs[i] * students[i].length);
            totalStudentCount += students[i].length;
        }

        // 학년 전체 평균 출력
        System.out.printf("\n학년 전체 평균: %.2f\n", totalSchoolAvgSum / totalStudentCount);
    }

    public static void printLine() {
        System.out.println("*************************************************");
    }
}