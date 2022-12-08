package Animal;

import Animal.Animal;

public class Mammals extends Animal {
    private String environment;
    private int speed;

    public Mammals(String name, int age, String environment, int speed) {
        super(name, age);
        this.environment = ValidateUtil.validateString(environment);
        this.speed = speed;
    }

    protected void walk() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    public String getEnvironment() {
        return environment;
    }

    public final void setEnvironment(String environment) {
        this.environment = ValidateUtil.validateString(environment);
    }

    public int getSpeed() {
        return speed;
    }

    public final void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal.Mammals{" +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", environment='" + environment + '\'' +
                ", speed=" + speed +
                '}';
    }
}