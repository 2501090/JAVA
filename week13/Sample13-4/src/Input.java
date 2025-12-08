import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static float[] readData(String[][] customers) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        float[] data = new float[customers.length];

        int i = 0;
        while (i < customers.length) {
            System.out.printf("%s 고객의 수도 사용량 입력 : ", customers[i][1]);
            data[i] = keyboard.nextFloat();

            if (data[i] >= 0.0f && data[i] <= 999.9f)
                i++;
            else {
                System.out.println("ERROR : ");
                System.in.read();
            }
        }

        return data;
    }

    public static void preProcess(String[][] customers) {
    }
}