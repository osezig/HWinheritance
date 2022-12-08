package Animal;

import Animal.ValidateUtil;

public class Herbivores extends Mammals {
    private String food;

    public Herbivores(String name, int age, String environment, int speed) {
        super(name, age, environment, speed);
    }

    public void graze() {

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        super.go();
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = ValidateUtil.validateString(food);
    }

    @Override
    public String toString() {
        return "Animal.Herbivores{" +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", environment='" + getEnvironment() + '\'' +
                ", speed=" + getSpeed() +
                ", food='" + food + '\'' +
                '}';
    }
}