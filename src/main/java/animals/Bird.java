package animals;

public class Bird extends Animal implements Swimmer{

    public Bird(String name){
        setName(name);
    }

    boolean canSwim = true;
    //
    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
    //
    @Override
    public boolean canSwim() {
        return canSwim;
    }
}
