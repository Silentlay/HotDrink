public class HotDrinkHeir extends HotDrink{
    private final int temperature;


    public HotDrinkHeir(String name, int price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrinkHeir{" +
                "name = " + getName() + '\''+
                ", price = " + getPrice() +
                ", volume = " + getVolume() +
                ", temperature = " + temperature +
                '}';
    }
}
