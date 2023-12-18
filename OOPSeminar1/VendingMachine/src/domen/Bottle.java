package domen;

public class Bottle extends Product{
    private double volume;

    public Bottle(String name, int place, int price, String type, double volume) {
        super(name, place, price, type);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " volume = " + this.volume + ";";
    }
}
