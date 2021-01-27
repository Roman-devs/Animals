package animals;

public class AnimalListItem {
    // Member Variables
    Animal value;
    AnimalListItem next;
    //Constructor
    public AnimalListItem(Animal value) {
        this.value = value;
    }
    public void addListItemAtEnd(AnimalListItem addedAnimal){
        if(next == null){
            next = addedAnimal;
        } else{
            next.addListItemAtEnd(addedAnimal);
        }
    }
    @Override
    public String toString() {
        if (next != null){
        return value.getName() + "->" + next.toString();
        } else {
            return value.getName();
        }
        }
}
