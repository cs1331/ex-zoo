public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void feed(int foodAmt, String foodType) {
        System.out.println("The " + name + " eats " + foodAmt
                + " lbs. of " + foodType);
    }

    public void feed(String foodType) {
        feed(1, foodType);
    }

    public abstract String showOff();

    public String toString() {
        return name;
    }
}
