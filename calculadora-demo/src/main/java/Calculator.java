public class Calculator {

    private final int lowerLimit;
    private final int upperLimit;

    public Calculator(int lowerLimit, int upperLimit) {

        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {

        isOutLimit(a, b);
        return a - b;
    }

    private boolean isOutLimit(int lowerLimit, int upperLimit) {
        if (lowerLimit >= this.lowerLimit && upperLimit <= this.upperLimit) {
            return true;
        } else throw new IllegalArgumentException();
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Second parameter cannot be Zero");
        }

        return a / b;
    }
}

