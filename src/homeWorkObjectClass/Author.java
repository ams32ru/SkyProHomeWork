package homeWorkObjectClass;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return "Имя: " + this.firstName + "\nФамилия: " + this.lastName + "\n";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a1 = (Author) other;
        return lastName.equals(a1.lastName) && firstName.equals(a1.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(lastName, firstName);
    }
}