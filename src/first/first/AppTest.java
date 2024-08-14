package first;

import java.math.BigDecimal;

public class AppTest {
    public static void main(String[] args) {

        // 더하기 "+" 메소드 테스트
        System.out.println("Add [+] Test");
        // 정수
        System.out.println("123 + 234 = " + math2.add(new BigDecimal("123"), new BigDecimal("234")));
        // 소수
        System.out.println("123.123 + 234.234 = " + math2.add(new BigDecimal("123.123"), new BigDecimal("234.234")));
        // 음수
        System.out.println("123.123 + (-234.123) = " + math2.add(new BigDecimal("123.123"), new BigDecimal("-234.234")));

        // 빼기 "-" 메소드 테스트
        System.out.println("Minus [-] Test");
        // 정수
        System.out.println("234 - 123 = " + math2.minus(new BigDecimal("234"), new BigDecimal("123")));
        // 소수
        System.out.println("234.234 - 123.123 = " + math2.minus(new BigDecimal("234.234"), new BigDecimal("123.123")));
        // 음수
        System.out.println("123.123 - 234.234 = " + math2.minus(new BigDecimal("123.123"), new BigDecimal("234.234")));

        // 곱하기 "x" 메소드 테스트
        System.out.println("Multi [x] Test");
        // 정수
        System.out.println("5 x 9 = " + math2.multi(new BigDecimal("5"), new BigDecimal("9")));
        // 소수
        System.out.println("5.1 x 9.2 = " + math2.multi(new BigDecimal("5.1"), new BigDecimal("9.2")));
        // 음수
        System.out.println("5 x (-9) = " + math2.multi(new BigDecimal("5"), new BigDecimal("-9")));

        // 나누기 "/" 메소드 테스트
        System.out.println("Divi [/] Test");
        // 정수
        System.out.println("10 - 2 = " + math2.divi(new BigDecimal("10"), new BigDecimal("2")));
        // 소수
        System.out.println("10.6 - 2.4 = " + math2.divi(new BigDecimal("10.6"), new BigDecimal("2.4")));

        // 올림 테스트
        System.out.println("Up Test");
        // 소수점 둘째 자리에서 올림
        System.out.println("123.456 to 2 = " + math2.roundUpByDigit("123.456", 2));
        // 소수점 셋째 자리에서 올림
        System.out.println("987.6543 to 3 = " + math2.roundUpByDigit("987.6543", 3));

        // 내림 테스트
        System.out.println("Down Test");
        // 소수점 둘째 자리에서 내림
        System.out.println("123.456 to 2 = " + math2.roundDownByDigit("123.456", 2));
        // 소수점 셋째 자리에서 내림
        System.out.println("987.6543 to 3 = " + math2.roundDownByDigit("987.6543", 3));

        // 사사오입 테스트
        System.out.println("Half Test");
        // 소수점 둘째 자리에서 사사오입
        System.out.println("123.456 to 2 = " + math2.roundByDigit("123.456", 2));
        // 소수점 셋째 자리에서 사사오입
        System.out.println("987.6543 to 3 = " + math2.roundByDigit("987.6543", 3));
    }

}