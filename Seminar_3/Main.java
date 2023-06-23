public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();

        // Adding some products
        vendingMachine.addProduct(new HotDrinkWithTemperature("Кофе", 250, 25, 80));
        vendingMachine.addProduct(new HotDrinkWithTemperature("Чай", 300, 90, 90));
        vendingMachine.addProduct(new HotDrinkWithTemperature("Горячий шоколад", 200, 30, 75));

        // Getting products
        HotDrinkWithTemperature coffee = vendingMachine.getProduct("Кофе", 250);
        if (coffee != null) {
            System.out.println("Полученный " + coffee.getName() + " (" + coffee.getVolume() + "ml) за $" + coffee.getPrice());
        } else {
            System.out.println("Кофе недоступен.");
        }

        HotDrinkWithTemperature tea = vendingMachine.getProduct("Чай", 300, 90);
        if (tea != null) {
            System.out.println("Полученный " + tea.getName() + " (" + tea.getVolume() + "ml) " + tea.getTemperature() + "°C за $" + tea.getPrice());
        } else {
            System.out.println("Чай не доступен при указанной температуре.");
        }
    }
}