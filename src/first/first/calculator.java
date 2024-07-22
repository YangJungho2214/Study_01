package first;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class calculator {

    // 더하기 "+"" 메소드 생성
    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    // 빼기 "-" 메소드 생성
    public BigDecimal minus(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    // 곱하기 "x" 메소드 생성
     public BigDecimal multi(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    // 곱하기 "x" 메소드 생성
      public BigDecimal divi(BigDecimal a, BigDecimal b) {
        return a.divide(b, 2, RoundingMode.HALF_UP);
    }

}
