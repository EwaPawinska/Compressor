package Compress;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class CostCalculatorTest {

    int given;
    BigDecimal expected;

    @Test
    public void calculate1SMS() {
        CostCalculator cc = new CostCalculator(new BigDecimal(0.35));
        given = 1;
        expected = new BigDecimal(0.35);

        assertEquals(expected, cc.calculate(given));
    }

    @Test
    public void calculate3SMSes() {
        CostCalculator cc = new CostCalculator(new BigDecimal("0.35"));
        given = 3;
        expected = new BigDecimal("1.05");

        assertEquals(expected, cc.calculate(given));
    }

    @Test
    public void calculate0SMSes() {
        CostCalculator cc = new CostCalculator(new BigDecimal("0.35"));
        given = 0;
        expected = new BigDecimal("0.00");

        assertEquals(expected, cc.calculate(given));
    }

    @Test
    public void calculateFreeSMS() {
        CostCalculator cc = new CostCalculator(new BigDecimal("0.0"));
        given = 1;
        expected = new BigDecimal("0.0");

        assertEquals(expected, cc.calculate(given));
    }
}
