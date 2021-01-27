package animals;

public class Reptile extends Animal implements Swimmer{
    boolean canSwim;
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
