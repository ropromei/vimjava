package helpers;

public class Person {
    private String _firstName;
    private String _lastName;

    public Person(String firstName, String lastName) {
        this._firstName = firstName;
        this._lastName = lastName;
    }

    public Person(String firstName) {
        this(firstName, null);
    }

    public String getName() {
        if (_lastName == null) {
            return _firstName;
        }

        return _firstName + " " + _lastName;
    }
}
