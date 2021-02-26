import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {
    @Test
    public void testAddBuddy() {
        BuddyInfo b1 = new BuddyInfo();
        BuddyInfo b2 = new BuddyInfo("Nic Porter", "1234567");
        BuddyInfo b3 = new BuddyInfo("N/A", "N/A");
        AddressBook addBook = new AddressBook();
        addBook.addBuddy(b1);
        addBook.addBuddy(b2);
        addBook.addBuddy(b3);
        assertEquals(3, addBook.size());
    }

    @Test
    public void testRemoveBuddy() {
        BuddyInfo b1 = new BuddyInfo();
        BuddyInfo b2 = new BuddyInfo("Nic Porter", "1234567");
        BuddyInfo b3 = new BuddyInfo("N/A", "N/A");
        AddressBook addBook = new AddressBook();
        addBook.addBuddy(b1);
        addBook.addBuddy(b2);
        addBook.addBuddy(b3);
        addBook.removeBuddy(b3);
        assertEquals(2, addBook.size());

    }
}