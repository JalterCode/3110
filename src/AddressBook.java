import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyList.add(buddy);
        }
    }


    public void removeBuddy(BuddyInfo buddy) {
        buddyList.remove(buddy);
    }

    //hello



}
