//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // int, float이 메모리에
        int a = 0; // 선언문, a를 변수
        float b = 0.0f;
        long c = 0L;
        byte d = 0;
        short f = 0;
        boolean t = false;
        char g = ' ';
        String y = " "; // C언어 방식
        String y = null;
        // String z = new String(); // 객체지향 방식
        final float PI = 3.141592f; // Symbolic Constant 기호적 상수

        a = 5; // 대입문, 5를 정수형 literal
        b = 5.5f; // 5.5는 기본적으로 double형이기 때문에 float은 안됨
        // 5.5f는 float 리터럴 5.5 double literal
        c = 5;

        // 해당되는 기억장소에 맞게끔 데이터 타입 작성해야함.
        PI = 3.14f; // 위에서 final로 고정시켜놨기에 수정하려고 하면 에러남.
        a = (int) 6L; // Cast 연산자 () 로 L벨류를 기준으로 해서 형변환 > 에러는 안나지만 데이터의 손실이 발생될수는 있다.
        d = (byte) 128;
        f = (short) 32768; // 32767까지는 들어감
        f + 5 = f; // 수식이 왼쪽에 올 수 없다.
        5 = f; // 항상 왼쪽에는 변수만 올 수 있다.
        a = a + 5; // 오른쪽은 a의 값을 의미, 변수는 기억장소가 있고 상수는 l밸류가 없다.
    }
}