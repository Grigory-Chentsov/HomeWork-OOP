// Класс калькулятора
public class Calculator {
    private double result;

    public Calculator() {
        result = 0;
    }

    public double getResult() {
        return result;
    }

    protected void setResult(double result) {
        this.result = result;
    }

    public void add(double number) {
        result += number;
    }

    public void subtract(double number) {
        result -= number;
    }

    public void multiply(double number) {
        result *= number;
    }

    public void divide(double number) {
        if (number != 0) {
            result /= number;
        } else {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
