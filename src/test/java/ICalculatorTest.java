import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ICalculatorTest {

    private final CalculatorImpl calculator = new CalculatorImpl();

    @Test
    public void positiveAddition() {
        Assert.assertEquals("Positive addition should return: ",5,calculator.addition(2,3));
    }

    @Test
    public void negativeAddition() {
        Assert.assertEquals("Negative addition should return: ",1,calculator.addition(-2,3));
    }

    @Test
    public void positiveSubtraction() {
        Assert.assertEquals("Positive subtraction should return: ",2,calculator.subtraction(5,3));
    }

    @Test
    public void negativeSubtraction() {
        Assert.assertEquals("Negative subtraction should return: ",15,calculator.subtraction(5,-10));
    }

    @Test
    public void positiveMultiplication() {
        Assert.assertEquals("Positive multiplication should return: ",25,calculator.multiplication(5,5));
    }

    @Test
    public void negativeMultiplication() {
        Assert.assertEquals("Negative multiplication should return: ",-25,calculator.multiplication(-5,5));
    }

    @Test
    public void positiveDivision() {
        Assert.assertEquals("Positive devision should return: ",2,calculator.division(10,5));
    }

    @Test
    public void negativeDivision() {
        Assert.assertEquals("Negative devision should return: ",-2,calculator.division(-10,5));
    }


    @Test(expected = ArithmeticException.class)
    public void divisionByZero() {
        calculator.division(10,0);
    }
}
