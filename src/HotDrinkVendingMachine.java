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
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product product : productList) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                    return hotDrink;
                }
            }
        }
        return null;
    }
}