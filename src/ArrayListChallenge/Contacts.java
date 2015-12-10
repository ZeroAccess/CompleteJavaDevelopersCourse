package ArrayListChallenge;

/**
 * Created by robertsg on 12/9/2015.
 */
public class Contacts {
    private String firstName;
    private String lastName;
    private String mobilePhoneNumber;
    private String homePhoneNumber;

    public Contacts(String firstName, String lastName, String mobilePhoneNumber, String homePhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

}
