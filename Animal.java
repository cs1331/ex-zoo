public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String showOff() {
        return "does absolutely nothing! What a boring animal!!!";
    }

    public String toString() {
        return name;
    }
}
