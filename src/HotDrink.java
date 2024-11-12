public class HotDrink extends Product {
    private int volume;
    private int temperature;

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}