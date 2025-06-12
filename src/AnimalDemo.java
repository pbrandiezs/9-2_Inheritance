public class AnimalDemo {
    public static void main(String[] args) {
        Animal anotherAnimal = new Dog("Sam", 100);

        Animal[] animals = new Animal[5];

        System.out.println("Name: " + anotherAnimal.getName());
        System.out.println("Weight: " + anotherAnimal.getWeight());
        System.out.println("Animal says: " + anotherAnimal.makeNoise());

        animals[0] = new Dog("Rover", 25);
        animals[1] = new Dog("Sunny", 15);
        animals[2] = new Dog("Duke", 75);
        animals[3] = new Cat("Fluffy", 8);
        animals[4] = new Cat("Cat", 15);

        printAnimals(animals);

    }

    public static void printAnimals(Animal[] animals)  {
        for (int i = 0; i < animals.length; i++) {
            System.out.println("\nName: " + animals[i].getName());
            System.out.println("Says: " + animals[i].makeNoise());
        }
    }
}
