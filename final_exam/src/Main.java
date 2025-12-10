import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[][][] students = {
                { // 1반
                        {"2501090", "배정환", "남"}, {"2501101", "김철수", "남"},
                        {"2501102", "이영희", "여"}, {"2501103", "박민수", "남"},
                        {"2501104", "최지우", "여"}, {"2501105", "정재형", "남"},
                        {"2501106", "강호동", "남"}, {"2501107", "유재석", "남"},
                        {"2501108", "아이유", "여"}
                },
                { // 2반
                        {"2502201", "구자철", "남"}, {"2502202", "손흥민", "남"},
                        {"2502203", "김연아", "여"}, {"2502204", "박지성", "남"},
                        {"2502205", "김민재", "남"}, {"2502206", "이강인", "남"},
                        {"2502207", "황희찬", "남"}, {"2502208", "지소연", "여"}
                },
                { // 3반
                        {"2503301", "한민국", "여"}, {"2503302", "안중근", "남"},
                        {"2503303", "유관순", "여"}, {"2503304", "윤봉길", "남"},
                        {"2503305", "김구", "남"},   {"2503306", "안창호", "남"},
                        {"2503307", "신채호", "남"}, {"2503308", "이봉창", "남"},
                        {"2503309", "남자현", "여"}, {"2503310", "박열", "남"}
                }
        };

        int[][][] score = new int[students.length][][];
        float[][] avg = new float[students.length][];

        String[][] notes = new String[students.length][];
        float[] classTotalAvgs = new float[students.length];

        // 입력
        for (int i = 0; i < students.length; i++) {
            score[i] = Input.inputData(students[i], i + 1);

            avg[i] = new float[students[i].length];
            notes[i] = new String[students[i].length];
        }

        // 처리
        Compute.calcTotal(score);

        for (int i = 0; i < students.length; i++) {
            Compute.calcAvg(score[i], avg[i]);
        }

        // 석차 계산 (동점자 처리)
        Compute.calcRank(score);
        Compute.calcClassStats(avg, notes, classTotalAvgs);

        // 출력
        Output.display(students, score, avg, notes, classTotalAvgs);
    }
}