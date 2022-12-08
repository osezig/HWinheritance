package Animal;

import Animal.Birds;

public class Flightless extends Birds {
    private String movementType;

    public Flightless(String name, int age, String environment, String movementType) {
        super(name, age, environment);
        this.movementType = ValidateUtil.validateString(movementType);
    }

    protected void walk() {

    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public String toString() {
        return "Animal.Flightless{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", environment='" + getEnvironment() + '\'' +
                ", movementType='" + movementType + '\'' +
                '}';
    }
}