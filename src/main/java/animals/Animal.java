package animals;
//
public class Animal {
    //
    private String name;
    private int oxygenLevel;
    private int bodyWeightKG;
    // Default Constructor
    public Animal(){
        this.oxygenLevel = 5;
    }
    //Constructor
    public Animal (int bodySize){
        this.oxygenLevel = 5;
        this.bodyWeightKG = bodyWeightKG;
    }
    //
    public void breathe (){
        System.out.println("Breathe in - Breathe out!");
        oxygenLevel += 10;
    }

    public boolean isAlive() {
        return oxygenLevel > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
