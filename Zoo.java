public class Zoo {

    private static Animal[] animals;

    public static void main(String[] args) {
        // TODO: You should create the animals array and add some animals to it

        for (Animal animal: animals) {
            System.out.println("You see a " + animal.toString() + " that "
                    + animal.showOff());
        }
    }
}
