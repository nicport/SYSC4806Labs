package lab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddressBookController {
    @Autowired
    AddressBookRepo repo;
    @Autowired
    BuddyInfoRepo buddyRepo;

    @GetMapping("/createAD")
    public String createAddressBook(Model model) {
        model.addAttribute("newAddressBook", new AddressBook());
        return "AddressBook";
    }

    @PostMapping("/createAD")
    public String display(@ModelAttribute AddressBook ad, Model model){
        //AddressBook aBook = new AddressBook();

       /* for (BuddyInfo buddy:
                buddyRepo.findAll()) {
            aBook.addBuddy(buddy);

        }*/
        repo.save(ad);
        model.addAttribute("newAddressBook",ad);
        return "addressbookCreated";
    }

    @GetMapping("/createBud")
    public String findBuddy(Model model){
        model.addAttribute("newBuddy", new BuddyInfo());
        return "BuddyInfo";
    }

    @PostMapping("/createBud")
    public String newBuddy(
                         @RequestParam(value="name") String name,
                         @RequestParam(value="phoneNum") String phoneNum,
                         @RequestParam(value="bookid") int bid, Model model){

        BuddyInfo b = new BuddyInfo(name, phoneNum);
        AddressBook a = repo.findById(bid);
        a.addBuddy(b);
        buddyRepo.save(b);
        repo.save(a);
        model.addAttribute("createBud", b);
        return "buddyAdded";
    }

    @GetMapping ("/viewAddressBook")
    public String createView(Model model){
        return "createView";
    }

    @PostMapping ("/viewAddressBook")
    public String displayView() {
        return "displayView";
    }




}

