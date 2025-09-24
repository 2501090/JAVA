public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = -a;
        int c = (((a++ + 2)) - --b);
        // b = b - 1; -6
        // c = a + 2 -b; 13
        // a = a + 1; 6
        int d = (((a--) + (++b)) + 2);
        // b = b + 1; -5
        // d = a + b + 2; 3
        // a = a - 1; 5

        float e = 5.0f / 4;
        // float e = (float) (5.0 / 4);

        a += 4; // 애가 실행 속도가 더 빠름
        // a = a + 4; (두 개의 항이 같을때)



        System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %.2f\n", a,b,c,d,e);
    }
}