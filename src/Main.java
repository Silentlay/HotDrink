//Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем int температура.
// 📌 Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
//соответствующий имени, объему и температуре
// 📌 В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//воспроизвести логику заложенную в программе
// 📌 Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new HotDrink("Cappuccino", 100, 200, 75));
        products.add(new HotDrink("Tea", 80, 250, 85));
        products.add(new HotDrink("Hot Chocolate", 120, 300, 70));

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(products);

        // Получение напитков по имени
        System.out.println(hotDrinkVendingMachine.getProduct("Tea"));

        // Получение напитка по имени, объему и температуре
        System.out.println(hotDrinkVendingMachine.getProduct("Cappuccino", 200, 75));
        System.out.println(hotDrinkVendingMachine.getProduct("Hot Chocolate", 300, 70));

        // Несуществующий продукт
        System.out.println(hotDrinkVendingMachine.getProduct("Cappuccino", 200, 60));
    }
}