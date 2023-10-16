package pl_gornik.Model;

import java.util.Objects;

public class Person{
    private String name;
    private String surname;
    private int age;
    private String pesel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getPesel(), person.getPesel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getPesel());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    public Person(String name, String surname, int age, String pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

}
