package animals;

public class Reptile extends Animal implements Swimmer{

    public Reptile(String name){
        setName(name);
    }

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
