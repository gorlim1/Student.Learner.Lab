package Abstract;

public abstract class Person {

    //Declaration, initializations
    protected String firstName;
    protected String lastName;
    protected int age;

    //Getters,Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //Default constructor
    //public Person() {}

    //Parameterized constructor
    public Person(String paramFirstName, String paramLastName, int paramAge) {
        firstName = paramFirstName;
        lastName = paramLastName;
        age = paramAge;
    }


    public String returnsFullName() {
        return firstName + " " + lastName;
    }

    public void displayPersonDetails() {
    }
}
