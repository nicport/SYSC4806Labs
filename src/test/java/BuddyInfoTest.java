import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    @Test
    public void name() {
        BuddyInfo b1 = new BuddyInfo();
        assertEquals("John Doe", b1.getName());
    }

    @Test
    public void number() {
        BuddyInfo b2 = new BuddyInfo("Nicholas Porter", "1234567");
        assertEquals("1234567", b2.getPhoneNum());
        b2.setName("New Name");
        assertEquals("New Name", b2.getName());

    }
}
