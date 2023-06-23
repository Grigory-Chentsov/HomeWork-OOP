// Начнем с создания потомка класса HotDrink дополнительным temperatureполем:
public class HotDrinkWithTemperature extends HotDrink {
    private int temperature;

    public HotDrinkWithTemperature(String name, int volume, int temperature, double price) {
        super(name, volume, temperature, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}