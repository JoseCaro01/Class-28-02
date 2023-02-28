package bigdecimals;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("100.056");
        BigDecimal bigDecimal1 =   BigDecimal.valueOf(1.01);
        System.out.println(bigDecimal);
        System.out.println( bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1));
        //-1 | 0 | 1
        if(bigDecimal.compareTo(bigDecimal1)> 0) {
            System.out.println("Bigdecimal es mayor que bigdecimal1");
        }
       BigDecimal bigDecimal2=  bigDecimal.setScale(4, RoundingMode.HALF_EVEN);

        System.out.println(bigDecimal2);
    }
}
