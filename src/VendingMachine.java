// Определить интерфейс для торговых автоматов
interface VendingMachine {
    HotDrink getProduct(String name, int volume);
    HotDrinkWithTemperature getProduct(String name, int volume, int temperature);
}
