import javax.swing.text.Position;

public class LearnMethods {
    public static void main(String[] args) {
        // System.out.println("Employee Bonus : " +calcBonus(5000));
        // System.out.println("CEO Bonus :" +calcBonus(20000,  1.5));
        // System.out.printf("Staff Bonus: $%,.2f\n", calcBonus(5000, 0.2));

        System.out.println("");
       

       

        System.out.printf("STAFF salary is $%,.2f%n: " , calcBonus(5000.0, Position.STAFF));

        double[] wages = {5000, 5000, 5000, 5000, 50000};


    }
    public static double calcBonus(double[] salaries, Position position){
        double total = 0.0;

        if (salaries.length >= 6){
            for(double salary : salaries){
                total += salary;
            }

        }
     return calcBonus((total/salaries.length), position);
        
    }

    public static double calcBonus(double salary){
        return salary*0.1;
    }
    public static double calcBonus(double salary, double bonusRate){
        return salary*bonusRate;
    }
    enum Position 
    {
        STAFF, MANAGER, CEO
    }
    public static double calcBonus(double salary, Position position){
        double bonusRate = switch(position){
            case CEO -> 3.0;
            case MANAGER -> 0.2;
            case STAFF -> 0.1;
        };
        return salary*bonusRate;
    }

    

        
    }







    // public class LearnMethods {

    //     public static void main(String[] args) {
    //         System.out.println("Employee bonus: " + calcBonus(5000));
    //         System.out.println("CEO Bonus: " + calcBonus(20000, 1.5));
    //         System.out.printf("Staff Bonus: $%,.2f\n", calcBonus(5000, 0.2));
    //         System.out.printf("CEO 2nd Bonus: $%,.2f%n", calcBonus(20000, 1.5));
    
    //         // Activity 1
    //         System.out.println("==== Activity 1 ====");
    //         Position role = Position.STAFF;
    
    //         System.out.printf(role + " Bonus: $%,.2f%n", calcBonus(5000, role));
    
    //         // Activity 2
    //         System.out.println("==== Activity 2 ====");
    //         double[] wages = {5000, 5000, 5000, 5000, 5100, 5100};
    //         System.out.printf(role + " Bonus: $%,.2f%n", calcBonus(wages, role));
    //     }
    
    //     enum Position {
    //         STAFF, MANAGER, CEO
    //     }
    
    //     public static double calcBonus(double[] salaries, Position position) {
    //         double total = 0.0;
    
    //         if(salaries.length < 6) {
    //             return 0;
    //         }
    
    //         for(double salary : salaries) {
    //             total += salary;
    //         }
    
    //         return calcBonus(total / salaries.length, position);
    //     }
    
    //     public static double calcBonus(double salary, Position position) {
    //         double bonusRates = switch(position) {
    //             case CEO -> 3.0;
    //             case MANAGER -> 0.2;
    //             case STAFF -> 0.1;
    //         };
    
    //         return salary*bonusRates;
    //     }
    
    //     public static double calcBonus(double salary) {
    //         return salary * 0.1;
    //     }
    
    //     public static double calcBonus(double salary, double bonusRate) {
    //         return salary * bonusRate;
    //     }
    // }
    

