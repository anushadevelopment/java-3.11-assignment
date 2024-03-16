import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        // String name1 = "Tony Stark";
        // int age1 = 35;
        // String gender1 = "male";
        // boolean isMarried1 = true;

        // String name2 = "Bruce Banner";
        // int age2 = 36;
        // String gender2 = "male";
        // boolean isMarried2 = false;

        // greet(name1, age1, gender1, isMarried1);
        // eat(name1, "burger");

        // greet(name2, age2, gender2, isMarried2);
        // eat(name2, "pizza");

        // Person personA = new Person();

        // personA.greet();
        // personA.eat("burger");

        Person tony = new Person("Tony Stark", 35, "male", true);

        // tony.greet();
        // tony.eat("burger");

        // Person bruce = new Person("Bruce Banner", 40);

        // bruce.greet();
        // bruce.eat("Pizza");

        // Person bruceClone = new Person(bruce);

        // bruceClone.greet();
        // bruceClone.eat("KFC");

        // tony.setName("Tony Stuck");
        // tony.setAge(25);

        // System.out.println(tony.getName());
        // System.out.println(tony.getAge());
        // System.out.println(tony.getGender());
        // System.out.println(tony.isMarried());

        // // Printing out a static variable
        // System.out.println(Person.scientificName);

        // Person peter = new Person("Peter Parker", 20, "male", false);
        // Person wanda = new Person("Wanda Maximoff", 25, "female", true);

        // System.out.println(Person.getPersonCount());

        // // Should not use instance to call a static method
        // System.out.println(peter.getPersonCount());

        // System.out.println(tony);

        ArrayList<Expense> expenses = new ArrayList<>();

        expenses.add(new Expense("Food", 100));
        expenses.add(new Expense("Transport", 500));
        System.out.println(expenses);

        Expense expense = new Expense("Food", 10.5);

        System.out.println(expense.name());
        System.out.println(expense.amount());
    }

    public static void greet(String name, int age, String gender, boolean isMarried) {
        System.out.println("Hello world, I'm " + name + " and I'm a " + age + " years old " + gender + ".");
    }

    public static void eat(String name, String meal) {
        System.out.println(name + " is currently eating " + meal);
    }
}