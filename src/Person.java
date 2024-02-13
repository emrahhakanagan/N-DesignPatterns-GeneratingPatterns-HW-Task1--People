import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private Integer age;
    private String address;

    public Person(String name, String surname, Integer age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return address != null && !address.isEmpty();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAddress(this.address);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return hasAge() ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', surname='%s', age=%d, address='%s'}", name, surname, age, address);
    }
}
