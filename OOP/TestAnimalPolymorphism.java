package OOP;

public class TestAnimalPolymorphism {

    public static void main(String[] args) {

        AnimalPolymorphism myAnimal = new AnimalPolymorphism();
        AnimalPolymorphism myCat = new PolyCat();
        AnimalPolymorphism myDog = new PolyDog();

        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();

    }
}