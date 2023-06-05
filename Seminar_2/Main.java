// Основной класс для тестирования калькулятора
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(6);
        calculator.add(3);
        System.out.println("Результат калькулятора: " + calculator.getResult());

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        scientificCalculator.add(10);
        scientificCalculator.square(2);
        System.out.println("Результат научного калькулятора: " + scientificCalculator.getResult());
    }
}
