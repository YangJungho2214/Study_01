package first;

import java.math.BigDecimal;
import java.math.RoundingMode;

//calculator를 상속
public class math2 extends calculator{

    //문자열(String)을 받아서 해당 자리수만큼 올리고 float으로 리턴
    public static float roundUpByDigit(String str, int digit) {
        //문자열을 받아서 BigDecimal로 변환
        BigDecimal bd = new BigDecimal(str);
        //지정 자릿수로 올림
        bd = bd.setScale(digit, RoundingMode.UP);
        //float로 변환해서 리턴
        return bd.floatValue();
    }

    //BigDecimal을 받아서 해당 자리수만큼 올리고 float으로 리턴(오버로딩)
    public static float roundUpByDigit(BigDecimal bd, int digit) {
        bd = bd.setScale(digit, RoundingMode.UP);
        return bd.floatValue();
    }

    //문자열(String)을 받아서 해당 자리수만큼 내림고 float으로 리턴
    public static float roundDownByDigit(String str, int digit) {
        //문자열을 받아서 BigDecimal로 변환
        BigDecimal bd = new BigDecimal(str);
        //지정 자릿수로 내림
        bd = bd.setScale(digit, RoundingMode.DOWN);
        //float로 변환해서 리턴
        return bd.floatValue();
    }

    // BigDecimal을 받아서 해당 자리수만큼 내림고 float으로 리턴(오버로딩)
    public static float roundDownByDigit(BigDecimal bd, int digit) {
        bd = bd.setScale(digit, RoundingMode.DOWN);
        return bd.floatValue();
    }

    //문자열(String)을 받아서 해당 자리수만큼 사사오입후 float으로 리턴
    public static float roundByDigit(String str, int digit) {
        //문자열을 받아서 BigDecimal로 변환
        BigDecimal bd = new BigDecimal(str);
        //지정 자릿수로 사사오입
        bd = bd.setScale(digit, RoundingMode.HALF_UP);
        //float로 변환해서 리턴
        return bd.floatValue();
    }

    // BigDecimal을 받아서 해당 자리수만큼 사사오입후 float으로 리턴(오버로딩)
    public static float roundByDigit(BigDecimal bd, int digit) {
        bd = bd.setScale(digit, RoundingMode.HALF_UP);
        return bd.floatValue();
    }

}
