public class AnimalDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rover", 70);

        System.out.println(myDog.move());

        Cat myCat = new Cat("Fluffy", 8);

        System.out.println(myCat.move());

    }

    public static void printAnimals(Animal[] animals)  {
        for (int i = 0; i < animals.length; i++) {
            System.out.println("\nName: " + animals[i].getName());
            System.out.println("Says: " + animals[i].makeNoise());
        }
    }
}
