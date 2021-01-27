package animals;

public class Bird extends Animal implements Swimmer{
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
