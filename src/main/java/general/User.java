package general;

import lombok.Data;

import static utils.RandomDataGenerator.*;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String password;

    public static String getSavedFirstName() {
        return savedFirstName;
    }

    public static void setSavedFirstName(String savedFirstName) {
        User.savedFirstName = savedFirstName;
    }

    public static String getSavedLastName() {
        return savedLastName;
    }

    public static void setSavedLastName(String savedLastName) {
        User.savedLastName = savedLastName;
    }

    private static String savedFirstName;
    private static String savedLastName;


    public User(){
        this.firstName = generateRandomInputString();
        this.lastName = generateRandomInputString();
        this.mobileNumber = generateRandomPhoneNumber();
        this.email = generateRandomEmail();
        this.password = generateRandomInputString();
    }
}
