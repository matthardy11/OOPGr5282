package domen;

public class HotDrink extends Product{
    private double drinkTemp;

    public HotDrink(String name, int place, int price, String type, double drinkTemp) {
        super(name, place, price, type);
        this.drinkTemp = drinkTemp;
    }

    public double getDrinkTemp() {
        return drinkTemp;
    }

    public void setDrinkTemp(double drinkTemp) {
        this.drinkTemp = drinkTemp;
    }

    @Override
    public String toString() {
        return super.toString() + " drinkTemp = " + this.drinkTemp + ";";
    }

}
