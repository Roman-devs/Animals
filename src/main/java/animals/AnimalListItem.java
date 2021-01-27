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

    public Animal getValue() {
        return value;
    }

    public AnimalListItem getNext() {
        return next;
    }
    public String getName(){
       return value.getName();
    }
    public void remove(String name){
        System.out.println();
        // Case for deleting first Item (listItem)
        if(name.equals(value.getName())){
            if (next != null) {
                value = next.getValue();
                    //
                    if (next.getNext() != null){
                    next = next.getNext();
//                    if (next != null){
//                        next.remove(name);
//                    }
                    }
                    if (next.getNext() == null){
                    next = null;
                }
            }
            if (next == null){

            }
        }
        // Case for deleting all others
        if(this.next != null) {
            if (name.equals(next.getName())) {
                next = next.getNext();  //1
                if(next.getNext() == null){
                    next = null;
                }
                if(next != null) {
                    next.remove(name);
                }
            } else {
                next.remove(name);
            }
        }
    }
    }
