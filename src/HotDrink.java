public class HotDrink extends Product {
    private final int volume;

    public HotDrink(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", volume=" + volume +
                '}';
    }
}