package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int maxSpeed;
    private final String typeOfFuel;
    private int quantityOfFuel;

    public Transport(String brand, String model, int year, String country,
                     String color, int maxSpeed, String typeOfFuel, int quantityOfFuel) {
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.country = ValidateUtil.validateString(country);
        this.color = ValidateUtil.validateString(color);

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.maxSpeed = maxSpeed;
        this.typeOfFuel = typeOfFuel;
        this.quantityOfFuel = quantityOfFuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "default";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = -1;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getQuantityOfFuel() {
        return quantityOfFuel;
    }

    public void setQuantityOfFuel(int quantityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public abstract void reFuel(int quantityOfFuel);
}