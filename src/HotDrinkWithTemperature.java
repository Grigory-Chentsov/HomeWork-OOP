// Определите подкласс HotDrink с дополнительным полем int для температуры
public class HotDrinkWithTemperature extends HotDrink {
    private int temperature;

    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume, temperature);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
