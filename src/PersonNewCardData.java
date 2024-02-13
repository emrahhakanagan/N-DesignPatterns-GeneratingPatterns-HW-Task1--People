public class PersonNewCardData {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonNewCardData setName(String name) {
        this.name = name;
        return this;
    }

    public PersonNewCardData setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonNewCardData setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
        return this;
    }

    public PersonNewCardData setAddress(String address) {
        this.address = address;
        return this;
    }

//    public Person build() {
//        if (name == null || surname == null) {
//            throw new IllegalStateException("Name and surname must be set");
//        }
//        return new Person();
//    }
}
