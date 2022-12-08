package Transport;

public class Train extends Transport {
    private int cost;
    private int travelTime;
    private String departure;
    private String destination;
    private int quantityWagon;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getQuantityWagon() {
        return quantityWagon;
    }

    public void setQuantityWagon(int quantityWagon) {
        this.quantityWagon = quantityWagon;
    }

    public Train(String brand, String model, int year, String country, String color,
                 int maxSpeed, int cost, int travelTime, String departure, String destination,
                 int quantityWagon, String typeOfFuel,int quantityOfFuel) {
        super(brand, model, year, country, color, maxSpeed, typeOfFuel, quantityOfFuel);
        this.cost = cost;
        this.travelTime = travelTime;
        this.departure = departure;
        this.destination = destination;
        this.quantityWagon = quantityWagon;
    }

    @Override
    public String toString() {

        return "Transport.Transport.Transport.Transport.Train{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", maxSpeed=" + getMaxSpeed() + '\'' +
                "cost=" + cost +
                ", travelTime=" + travelTime +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", quantityWagon=" + quantityWagon +
                ", typeOfFuel=" + getTypeOfFuel() + '\'' +
                ", quantityOfFuel=" + getQuantityOfFuel() + '\'' +
                '}';
    }

    @Override
    public void reFuel(int quantityOfFuel) {
        setQuantityOfFuel(getQuantityOfFuel()+quantityOfFuel);
    }
}