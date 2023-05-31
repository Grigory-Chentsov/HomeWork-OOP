// Реализуйте класс Hot Drinks Machine, реализующий интерфейс VendingMachine.
public class HotDrinksMachine implements VendingMachine {
    @Override
    public HotDrink getProduct(String name, int volume) {
        return new HotDrink(name, volume, 0); // Предполагая, что температура не требуется для этого метода
    }

    @Override
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}
