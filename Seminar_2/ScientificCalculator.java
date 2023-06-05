// Класс Scientific Calculator расширяет класс Calculator
public class ScientificCalculator extends Calculator {
    public void square(double number) {
        double squared = Math.pow(number, 2);
        setResult(squared);
    }

    public void cube(double number) {
        double cubed = Math.pow(number, 3);
        setResult(cubed);
    }

    // Переопределить метод деления из класса Calculator
    @Override
    public void divide(double number) {
        if (number != 0) {
            setResult(1 / number);
        } else {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}

