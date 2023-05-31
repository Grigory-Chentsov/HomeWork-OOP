/* Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
   Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
   метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
   В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную
   в программе
   Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре */

public class Main {
    public static void main(String[] args) {
        HotDrinksMachine machine = new HotDrinksMachine();

        HotDrink hotDrink = machine.getProduct("Coffee", 250);
        System.out.println("Hot Drink: " + hotDrink.getName() + ", Volume: " + hotDrink.getVolume());

        HotDrinkWithTemperature hotDrinkWithTemperature = machine.getProduct("Tea", 300, 80);
        System.out.println("Hot Drink: " + hotDrinkWithTemperature.getName() +
                ", Volume: " + hotDrinkWithTemperature.getVolume() +
                ", Temperature: " + hotDrinkWithTemperature.getTemperature());
    }
}

