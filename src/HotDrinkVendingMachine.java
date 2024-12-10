import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> productList;

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    // Перегруженный метод для получения напитка по имени, объему и температуре
    public String getProduct(String name, int volume, int temperature) {
        for (Product product : productList) {
            if (product instanceof HotDrinkHeir hotDrinkHeir) {
                if (hotDrinkHeir.getName().equals(name) &&
                        hotDrinkHeir.getVolume() == volume &&
                        hotDrinkHeir.getTemperature() == temperature) {
                    return hotDrinkHeir.toString();
                }
            }
        }
        return "Продукт не найден: " + name + ", " + volume + " мл, " + temperature + " C";
    }
}
