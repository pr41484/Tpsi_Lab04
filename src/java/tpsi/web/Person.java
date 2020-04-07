package tpsi.web;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    public Person(String _firstName, String _lastName, String emailAddress) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.email = emailAddress;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String emailAdress) {
        this.email = emailAdress;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + email;
    }
}
