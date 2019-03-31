package Compress;

import java.math.BigDecimal;

public class CostCalculator {

    private BigDecimal unitPrice;


    CostCalculator(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    BigDecimal calculate(int countSms) {
        return unitPrice.multiply(new BigDecimal(countSms));
    }
}

     //   itemCost  = price.multiply(new BigDecimal(countSms));