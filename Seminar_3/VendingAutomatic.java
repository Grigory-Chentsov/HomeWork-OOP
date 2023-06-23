interface VendingAutomatic {
    HotDrink getProduct(String name, double volume);
    HotDrinkWithTemperature getProduct(String name, double volume, int temperature);
}
