package week3_day2_1005_calculator;

public class Main {
    public static void main(String[] args) {

        NumberGenerator numberGenerator = new SpecificNumberGenerator();
        Calculator randomNumberCalculator = new Calculator(numberGenerator);
        randomNumberCalculator.plus();

        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator());
        specificNumberCalculator.plus();

    }
}
