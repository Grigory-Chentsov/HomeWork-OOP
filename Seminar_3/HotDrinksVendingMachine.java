// HotDrinksVendingMachine класс, реализующий VendingAutomatic интерфейс и предоставляющий перегруженный
// getProduct метод:
import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingAutomatic {
    private List<HotDrinkWithTemperature> products;

    public HotDrinksVendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(HotDrinkWithTemperature product) {
        products.add(product);
    }

    @Override
    public HotDrinkWithTemperature getProduct(String name, double volume) {
        for (HotDrinkWithTemperature product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume) {
                return product;
            }
        }
        return null;  // Product not found
    }

    public HotDrinkWithTemperature getProduct(String name, double volume, int temperature) {
        for (HotDrinkWithTemperature product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;  // Product not found
    }
}
