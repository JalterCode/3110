import java.util.ArrayList;

public class addressBook {

    private ArrayList<BuddyInfo> buddyList;



    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyList.add(buddy);
        }
    }


    public void removeBuddy(BuddyInfo buddy) {
        buddyList.remove(buddy);
    }

    public static void main(String[] args){
        addressBook addressBook = new addressBook();
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}
