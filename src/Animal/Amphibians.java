package Animal;

public class Amphibians extends Animal {
    private String environment;

    public Amphibians(String name, int age, String environment) {
        super(name, age);
        this.environment = ValidateUtil.validateString(environment);
    }

    protected void hunting() {

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

    public void setEnvironment(String environment) {
        this.environment = ValidateUtil.validateString(environment);
    }

    @Override
    public String toString() {
        return "Animal.Animal.Amphibians{" +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", environment='" + environment + '\'' +
                '}';
    }
}