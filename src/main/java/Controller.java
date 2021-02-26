import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View app;

    public void actionPerformed(ActionEvent e) {
        /*
        if(e.getSource() == app.getAddBuddy()) {
            try {
                BuddyInfo buddy = new BuddyInfo();
                buddy.setName(app.getNameTF().getText());
                buddy.setPhoneNum(app.getPhoneNumTF().getText());
                app.addressBook.addBuddy(buddy);
                System.out.println("Added buddy " + buddy.getName());
            }
            catch (Exception exception) {
                System.out.println("Something went wrong...");
            }
        } else if(e.getSource() == app.getViewBuddies()) {
            try {
                System.out.println("View was clicked");
                System.out.println(app.addressBook.getAddressBook());
                for (BuddyInfo b: app.addressBook.getAddressBook()) {
                    System.out.println("Buddy name: " + b.getName() + " Buddy phone number: " + b.getPhoneNum());
                }

            }
            catch (Exception exception) {
                System.out.println("Something went wrong...");
            }
        }
    }

    public void setApp(View app) {
        this.app = app;
    */
    }


}
