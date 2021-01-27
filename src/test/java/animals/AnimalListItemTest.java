package animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

    @Test
    public void toStringTest(){
        AnimalListItem listItem = new AnimalListItem(new Bird("Horst"));
        AnimalListItem secondListItem = new AnimalListItem(new Bird("Hartmut"));
        AnimalListItem thirdListItem = new AnimalListItem(new Bird("Johann"));
        //
        listItem.addListItemAtEnd(secondListItem);
        listItem.addListItemAtEnd(thirdListItem);
        //Expected Result
        String expected ="Horst->Hartmut->Johann";
        //
        assertEquals(expected,listItem.toString());
    }

    @Test
    public void removeTest(){
        AnimalListItem listItem = new AnimalListItem(new Bird("Voldemort"));
        AnimalListItem secondListItem = new AnimalListItem(new Bird("Hartmut"));
        AnimalListItem thirdListItem = new AnimalListItem(new Bird("Peter"));
        AnimalListItem fourthListItem = new AnimalListItem(new Reptile("Lisa"));
        //
        listItem.addListItemAtEnd(secondListItem);
        listItem.addListItemAtEnd(thirdListItem);
        listItem.addListItemAtEnd(fourthListItem);
        //REMOVE METHOD CALL
        listItem.remove("Hartmut");
        System.out.println("Test Printout");
        //
        //Expected Result
        String expected ="Voldemort->Peter->Lisa";
        //
        assertEquals(expected,listItem.toString());
    }

}