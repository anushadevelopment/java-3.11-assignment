public class Person {
    
    // Fields
    protected String name;
    private int birthYear;

    // Constructors
    public Person(){}

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    };

    // Instance methods
    public void greet() {
        System.out.println("👋 Hello, my name is " + this.name + " and I am a " + (2024 - this.birthYear) + " year old " + this.getClass().getSimpleName().toLowerCase() + ".");
    }

    public void doWork() {
        System.out.println(this.name + " is working.");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        // if(birthYear < 1990 || birthYear > 2021) {
        if(birthYear < 1970 || birthYear > 2020) {
            System.out.println("Invalid birth year");
            return;
        }
        this.birthYear = birthYear;
    }

}
