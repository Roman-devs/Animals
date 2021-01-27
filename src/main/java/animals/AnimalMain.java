package animals;

public class AnimalMain {

    public static void main(String[] args) {
        // Create Object
        Swimmer duck = new Bird();
        Bird secondDuck = new Bird();
        // Call Methods
        boolean duckCanSwim = duck.canSwim();
        boolean secondDuckisAlive = secondDuck.isAlive();
        boolean secondDuckCanSwim = secondDuck.canSwim();
        // Print Out Results
        System.out.println("Duck can Swim: " + duckCanSwim);
        System.out.println("Second Duck is alive :" + secondDuckisAlive);
    }
}
