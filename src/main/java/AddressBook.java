import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class AddressBook extends DefaultListModel<BuddyInfo> {
    private Collection<BuddyInfo> addressBook;
    private String id;

    public AddressBook() {
        super();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.addElement(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.removeElement(buddy);
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public String getId() {
        return id;
    }

    @OneToMany
    public Collection<BuddyInfo> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(Collection<BuddyInfo> buddyInfo) {
        this.addressBook = (Collection<BuddyInfo>) buddyInfo;
    }
}
