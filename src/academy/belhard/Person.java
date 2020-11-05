package academy.belhard;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    Person (String firstName,String lastName, Gender gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
    }
    @Override
    public boolean equals(Object obj) {

        if (!(this.hashCode() == obj.hashCode())) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if(!(obj instanceof Person)){
            return false;
        }

        Person person = (Person) obj;

        return firstName == person.firstName && lastName == person.lastName;
    }


    @Override
    public int hashCode() {
        int hash = firstName.hashCode() + 9 * lastName.hashCode() + gender.hashCode();

        return hash;
    }

    @Override
    public String toString() {

        return "Person{Имя: "+ firstName+", Фамилия: "+ lastName + ", пол: "+gender + "}";
    }

}
