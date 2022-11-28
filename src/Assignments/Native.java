package Assignments;

public class Native {
    private String firstName;
    private  String lastName;
    private  String phoneNumber;
    private  String emailAddress;
    private  String address;

    public Native(Human human){
        firstName = human.getFirstName();
        lastName = human.getLastName();
        phoneNumber = human.getPhoneNumber();
        emailAddress = human.getEmailAddress();
        address = human.getAddress();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
