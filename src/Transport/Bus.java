package Transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, String typeOfFuel, int quantityOfFuel) {
        super(brand, model, year, country, color, maxSpeed, typeOfFuel, quantityOfFuel);
    }

    @Override
    public void reFuel(int quantityOfFuel) {
        setQuantityOfFuel(getQuantityOfFuel()+quantityOfFuel);
    }

    @Override
    public String toString() {
        return "Transport.Transport.Transport.Transport.Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", maxSpeed=" + getMaxSpeed() + '\'' +
                ", typeOfFuel=" + getTypeOfFuel() + '\'' +
                ", quantityOfFuel=" + getQuantityOfFuel() + '\'' +
                "}";
    }

}