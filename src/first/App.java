package first;
public class App {
    public static void main(String[] args) throws Exception {

        if (args.length < 3) {
            System.out.println("인수의 갯수가 모자릅니다. 인수는 3개를 입력해주세요.");
            System.exit(1);
        } else if (args.length > 3) {
                System.out.println("인수의 갯수가 많습니다. 인수는 3개를 입력해주세요.");
                System.exit(1);
        }
        
        //변수 정의
        long lnum1 = 0, lnum2 = 0;

        try {
            lnum1 = Long.parseLong(args[0]); 
            lnum2 = Long.parseLong(args[2]);

            if (lnum1 > Integer.MAX_VALUE || lnum2 > Integer.MAX_VALUE) {
                System.out.println("인수가 범위 밖입니다.[계산결과 값 최대치:2,147,483,647]");  
                System.exit(1);
            } 
        } catch (NumberFormatException e) {
                System.out.println("첫번째 세번째 인수가 숫자가 아닙니다.");  
                System.exit(1);
        }

        //long타입의 입력값을 int로 변환 후 변수에 선언
        int num1 = (int) lnum1;
        int num2 = (int) lnum2;

        //연산자를 변수에 선언
        char plus = args[1].charAt(0);

        //답 초기화
        long answer = 0;

        //계산시작
        // 에러가나면 [isChecked 변수랑 errMsg를 정의해서 System.exit(1)로 종료때림] 이렇게 될 수 있게 해보기
        if (plus == '+') {
            answer = (long) num1 + num2;
        } else if (plus == '-') {
            answer = (long) num1 - num2;
        } else if (plus == 'x') { //else if (plus == '*') { 로 했을시 [인수의 갯수가 모자랍니다. 3개를 입력해주세요.] 에러가 발생 해결 방법 못 찾음.. 이스케이프??
            answer = (long) num1 * num2;
        } else if (plus == '/') {
            answer = (long) num1 / num2;
        } else {
            System.out.println("두번째 인수는 + - x / 만 입력해주세요.");
            System.exit(1);
        }

        if (answer > Integer.MAX_VALUE) {
            System.out.println("계산범위를 초과 했습니다.[최대치:2,147,483,647]"); 
            System.exit(1);
        }

        System.out.println("결과는[" + num1 + " " + plus + " " + num2 + " = " + answer + "]입니다.");
}
    }
