public class AddTwoNumbers {
    public static void main(String[] args) {
        String firstNumberInput = System.console().readLine("First Number:");
        String secondNumberInput = System.console().readLine("Second Number:");

        int a = Integer.parseInt(firstNumberInput); // A
        int b = Integer.parseInt(secondNumberInput); // B

        int sum = a + b;
        System.out.println("The Sum of both numbers: " + a + " and " + b + " is " + sum);
    }
}
