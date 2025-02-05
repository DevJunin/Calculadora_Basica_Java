package CalculadoraBasica;

public class Logic implements mathBasic{
    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double deduct(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double split(double num1, double num2) {
        return num1 / num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }
}
