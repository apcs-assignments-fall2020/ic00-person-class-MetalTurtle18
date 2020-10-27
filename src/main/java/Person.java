public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void doSomething() {
        System.out.println("I am watching Netflix");
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}













