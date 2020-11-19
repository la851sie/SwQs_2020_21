/**
 * Interface for the implementation of a simple calculator for interger values
 *
 * @author Laurin Siefermann
 *
 */
public interface ICalculator {
    /**
     * <p>The method addition takes two integer values, performs an addition and returns the result
     * </p>
     * @param firstNumber input integer value
     * @param secondNumber input integer value
     * @return result of addition
     */
    public int addition (int firstNumber, int secondNumber);

    /**
     * <p>The method subtraction takes two integer values, performs a subtraction and returns the result
     * </p>
     * @param firstNumber input integer value
     * @param secondNumber input integer value
     * @return result of subtraction (first - second)
     */
    public int subtraction (int firstNumber, int secondNumber);

    /**
     * <p>The method multiplication takes two integer values, performs a multiplication and returns the result
     * </p>
     * @param firstNumber input integer value
     * @param secondNumber input integer value
     * @return result of multiplication
     */
    public int multiplication (int firstNumber, int secondNumber);

    /**
     * <p>The method division takes two integer values, performs a division and returns the result
     * </p>
     * @param firstNumber input integer value
     * @param secondNumber input integer value
     * @return result of division (first/second)
     */
    public int division (int firstNumber, int secondNumber);

}
