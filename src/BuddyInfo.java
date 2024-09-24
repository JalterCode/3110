public class BuddyInfo {

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public BuddyInfo() {
        this.name = "N/A";
        this.address = "N/A";
        this.phoneNumber = "N/A";
    }

    private String name;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    private String address;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String phoneNumber;

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("John","123 Trail","123-456-7891");
        System.out.println("Hello " + buddy.getName());



    }
}
