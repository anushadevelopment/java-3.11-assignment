import java.util.ArrayList;

public class ExpenseApp{
    public static void main(String[] args) {
        boolean isContinue = true;
        ArrayList<Double> addExpenses = new ArrayList<>(); 
        Double expense = 0.0;
        String userInput = "";
        do{
            userInput =  System.console().readLine("1. Add an expense \n 2. List all expenses\n 3. Calcualte total expenses\n 4. Calculate average expense\n 5. Exit \n");
            switch (userInput) {
                case "1":
                    expense = Double.parseDouble(System.console().readLine("Enter the expense : "));
                    addExpenses.add(expense);                   
                    break;
                case "2":
                    addExpenses.forEach((addExpense) -> System.out.println(addExpense));
                    break;    
                case "3":
                        double totalExpense = 0.0;
                        for (double addExpense : addExpenses) {
                            totalExpense += addExpense;
                        }  
                        System.out.printf("Total expense : $%.2f\n" ,totalExpense);    
                        break; 
                case "4":
                    double total = 0.0;
                    double average = 0.0;
                    for (double addExpense : addExpenses) {
                        total += addExpense;
                    } 
                    average = total/(double)addExpenses.size();
                    System.out.printf("Average : $%.2f\n", average);
                    break;
                case "5":
                    isContinue = false;
                    break;
                default:
                    System.out.println("Invalid Input ");
                    break;
            }

        }while (isContinue);    
        
    }
}