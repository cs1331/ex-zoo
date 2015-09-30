public class Zoo {

    private static Animal[] animals;

    public static void main(String[] args) {
        // TODO: You should create the animals array and add some animals to it
        animals = new Animal[3];
        animals[0] = new PolarBear();
        animals[1] = new Elephant();
        animals[2] = new PolarBear();

        for (Animal animal: animals) {
            System.out.println("You see a " + animal.toString()
                    + " that " + animal.showOff());
        }
    }
}
