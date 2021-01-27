package animals;

public class AnimalMain {

    public static void main(String[] args) {
        // Create Animal Object
        Swimmer duck = new Bird("Horst");
        Bird secondDuck = new Bird("Hartmut");
        // Create AnimalListItem Object
        AnimalListItem listItem = new AnimalListItem(secondDuck);
        AnimalListItem secondListItem = new AnimalListItem(new Animal());
        AnimalListItem thirdListItem = new AnimalListItem(new Animal());
        AnimalListItem fourthListItem = new AnimalListItem(new Animal());
        // Call Methods for Linked Lists
        listItem.addListItemAtEnd(secondListItem);
        listItem.addListItemAtEnd(thirdListItem);
        listItem.addListItemAtEnd(fourthListItem);
        // Call Methods for class / interface dependencies
        boolean duckCanSwim = duck.canSwim();
        boolean secondDuckisAlive = secondDuck.isAlive();
        boolean secondDuckCanSwim = secondDuck.canSwim();
        // Print Out Results
        System.out.println("Duck can Swim: " + duckCanSwim);
        System.out.println("Second Duck is alive: " + secondDuckisAlive);
        System.out.println("Second Duck can swim: " + secondDuckCanSwim);
    }
}
