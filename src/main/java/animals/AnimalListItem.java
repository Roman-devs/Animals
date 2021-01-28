package animals;

public class AnimalListItem {
    // Member Variables
    Animal value;
    AnimalListItem next;

    //Constructor
    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public void addListItemAtEnd(AnimalListItem addedAnimal) {
        if (next == null) {
            next = addedAnimal;
        } else {
            next.addListItemAtEnd(addedAnimal);
        }
    }

    @Override
    public String toString() {
        if (next != null) {
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

    public String getName() {
        return value.getName();
    }

    public void remove(String name) {
        System.out.println();
        // Case for deleting first Item (listItem)
        if (name.equals(value.getName())) {
            if (next != null) {
                value = next.getValue();
                //
                if (next.getNext() != null) {
                    next = next.getNext();
//                    if (next != null){
//                        next.remove(name);
//                    }
                }
                if (next.getNext() == null) {
                    next = null;
                }
            }
            if (next == null) {

            }
        }
        // Case for deleting all others
        if (this.next != null) {
            if (name.equals(next.getName())) {
                next = next.getNext();  //1
                if (next.getNext() == null) {
                    next = null;
                }
                if (next != null) {
                    next.remove(name);
                }
            } else {
                next.remove(name);
            }
        }
    }

    public void remove2(String name) {
        // Scenario: first listItem is to be deleted through criteria
        if (name.equals(value.getName())) {
            System.out.println("must be printed twice");
            value = next.getValue(); // Following Value is cloned onto First value
            next = next.getNext();  // Following Next is cloned onto First Next
            remove2(name);
        }
        if (next.getNext() == null) {
            System.out.println("Gleich Null Test 1");
            if (next.getName().equals(name)) {
                System.out.println("Gleich Null Test 2");
                System.out.println(" Current Position " + " " + getName());
                System.out.println(" Current Next " + " " + getNext());
                System.out.println("Next Position" + " " + next.getName());
                System.out.println("Next NEXT" + " " + next.getNext());
                next = null;
            }
        }
    }

    public void remove3(String name){
//        Current Field is not to be deleted but the following
        if (getNext() != null & !getName().equals(name) & name.equals(next.getName())) {
            System.out.println("1");
            next = next.getNext();
        }
//        Current Field is deleted, but only if it is not the last list element, and that
//        the next does not comply with deletion criteria.
        if (getNext() != null & next.getNext() != null & getName().equals(name) & !name.equals(next.getName())) {
            System.out.println("2");
            value = next.getValue();
            next = next.getNext();

        }
//        Current Field is deleted, but only if it is not the last list element, and that
//        the following DOES COMPLY with deletion criteria.
        if (getNext() != null & getName().equals(name) & name.equals(next.getName())) {
            System.out.println("3");
            value = next.getValue();
            next = next.getNext();

        }
//        Current Field is not to be deleted, but next one is with its next being null.
        if (getNext() != null & next.getNext() == null & next.getName().equals(name) & !name.equals(getName())) {
            System.out.println("4");
            next = null;
        }
    }

    public void remove4(String name){
        while (getName().equals(name)){
            value = value;
        }
    }
}
