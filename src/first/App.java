package first;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {

        int index = 1;

        for (String e : args) {
            System.out.println(index + "번째 인수는 " + e + " 입니다.");
            index ++;
        }

        //인수의 갯수를 체크
        if (args.length < 3) {
            System.out.println("인수의 갯수가 모자릅니다. 인수는 3개를 입력해주세요.");
            System.exit(1);
        } else if (args.length > 3) {
            System.out.println("인수의 갯수가 많습니다. 인수는 3개를 입력해주세요.");
            System.exit(1);
        }
        
        //변수 정의 및 초기화
        BigDecimal num1 = BigDecimal.ZERO, num2 = BigDecimal.ZERO;

        //첫번째 인수와 세번째 인수를 체크해서 숫자가 아니면 에러 발생
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

        //calculator클래스의 객체 생성
        math2 calc = new math2();

        //계산시작
        if (plus.equals("+")) {
            answer = calc.add(num1, num2);
        } else if (plus.equals("-")) {
            answer = calc.minus(num1, num2);
        } else if (plus.equals("x")) {
            answer = calc.multi(num1, num2);
        } else if (plus.equals("/")) {
            answer = calc.divi(num1, num2);
        } else {
            System.out.println("두번째 인수는 + - x / 만 입력해주세요.");
            System.exit(1);
        }

        System.out.println("결과는[" + num1 + " " + plus + " " + num2 + " = " + answer + "]입니다.");
    }
}