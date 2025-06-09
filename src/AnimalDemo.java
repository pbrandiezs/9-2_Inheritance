public class AnimalDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Fido", 80);
        Dog myDog = new Dog("Rover", 50);
        Cat myCat = new Cat("Princess", 7);

        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Weight: " + myAnimal.getWeight());
        System.out.println("Animal says, " + myAnimal.makeNoise());

        System.out.println("\nName: " + myDog.getName());
        System.out.println("Weight: " + myDog.getWeight());
        System.out.println("Doggy says, " + myDog.makeNoise());

        System.out.println("\nName: " + myCat.getName());
        System.out.println("Weight: " + myCat.getWeight());
        System.out.println("Cat says, " + myCat.makeNoise());
    }
}
