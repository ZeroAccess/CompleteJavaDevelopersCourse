package ArrayListChallenge;

/**
 * Created by robertsg on 12/9/2015.
 */
public class Contacts {
    private String firstName;
    private String lastName;
    private int mobilePhoneNumber;
    private int homePhoneNumber;
    private String notes;

    public Contacts(String firstName, String lastName, int mobilePhoneNumber, int homePhoneNumber, String notes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.homePhoneNumber = homePhoneNumber;
        this.notes = notes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public int getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getNotes() {
        return notes;
    }
}
