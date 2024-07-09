package first;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) throws Exception {

        //인수의 갯수를 체크
        if (args.length < 3) {
            System.out.println("인수의 갯수가 모자릅니다. 인수는 3개를 입력해주세요.");
            System.exit(1);
        } else if (args.length > 3) {
            System.out.println("인수의 갯수가 많습니다. 인수는 3개를 입력해주세요.");
            System.exit(1);
        }
        
        //변수 정의
        BigDecimal num1 = BigDecimal.ZERO, num2 = BigDecimal.ZERO;

        try {
            num1 = new BigDecimal(args[0]); 
            num2 = new BigDecimal(args[2]);
            } catch (NumberFormatException e) {
                System.out.println("첫번째 세번째 인수가 숫자가 아닙니다.");  
                System.exit(1);
            }

        //연산자를 변수에 선언
        String plus = args[1];

        //연산자가 1자리가 아니면 에러발생
        if (plus.length() != 1) {
            System.out.println("연산자는 한 글자여야 합니다. EX : + - x /");
            System.exit(1);
        }

        //답 변수선언 및 초기화
        BigDecimal answer = BigDecimal.ZERO;

        //계산시작
        if (plus.equals("+")) {
            answer = num1.add(num2);
        } else if (plus.equals("-")) {
            answer = num1.subtract(num2);
        } else if (plus.equals("x")) {
            answer = num1.multiply(num2);
        } else if (plus.equals("/")) {
            answer = num1.divide(num2, 2, RoundingMode.HALF_UP);
        } else {
            System.out.println("두번째 인수는 + - x / 만 입력해주세요.");
            System.exit(1);
        }

        System.out.println("결과는[" + num1 + " " + plus + " " + num2 + " = " + answer + "]입니다.");
}
    }