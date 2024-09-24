import java.util.ArrayList;

public class addressBook {

    private ArrayList<BuddyInfo> buddyList;

    public addressBook() {
        buddyList = new ArrayList<>();
    } //lolol

    public void addBuddy(BuddyInfo buddy) { //added from github lol
        if (buddy != null) {
            buddyList.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddyList.size()) {
            return buddyList.remove(index);
        }
        return null;
    }

    public void randomMethod(){

    }

    public static void main(String[] args) {
        addressBook addressBook = new addressBook();
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        addressBook.addBuddy(buddy);

        addressBook.removeBuddy(0); // lol
    }

}
