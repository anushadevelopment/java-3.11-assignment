public class Person {
    
    public static final String scientificName = "Homo Sapien";
    private static int personCount = 0;

    private String name;
    private int age;
    private String gender;
    private boolean isMarried;

    // explicitly declaring the no-arg constructor
    // public Person() {}

    public Person(String name, int age, String gender, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        personCount++;
    }

    public Person(String name, int age) {
        this(name, age, "Unknown", false);
    }

    // copy Constructor
    public Person(Person person) {
        this(person.name + " clone", person.age, person.gender, person.isMarried);
    }

    // Getter
    public static int getPersonCount() {
        return personCount;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public void greet() {
        System.out.println("Hello world, I'm " + name + " and I'm a " + age + " years old " + gender + ".");
        System.out.println(isMarried ? "I'm married" : "I'm not married" );
    }

    public void eat(String meal) {
        System.out.println(name + " is currently eating " + meal);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", isMarried=" + isMarried + "]";
    }

    
}
