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

}