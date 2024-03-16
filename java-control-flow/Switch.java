import javax.sound.midi.Soundbank;

public class Switch {
    public static void main(String[] args) {
        String direction = System.console().readLine("Enter your direction ");
        // switch(direction) {
        //     case "N":
        //         System.out.println("North");
        //         break;
        //     case "S":
        //         System.out.println("South");
        //         break;
        //     case "E":
        //         System.out.println("East");
        //         break;
        //     case "W":
        //         System.out.println("West");
        //         break;
        //     default:
        //         System.out.println("Please enter a valid value");
        // }

        // switch (direction) {
        //     case "N":
        //     case "W":
        //     case "E":
        //         System.out.println("You have entered a valid value");
                
        //         break;
        
        //     default:
        //         System.out.println("Invalid input");
        //         break;
        // }

        // String month = System.console().readLine("Enter the month : ");
        // switch (month) {
        //     case "january":
        //     case "February":
        //     case "march":
        //         System.out.println("Q1"); 
        //         break;
        //     case "April":
        //     case "May":
        //     case "June":
        //         System.out.println("Q2");
        //         break;
        //     default:
        //         System.out.println("Enter a valid month");
        //         break;
        // }

        switch (direction) {
            case "N" -> System.out.println("North");
            case "E" -> System.out.println("East");
            case "W" -> System.out.println("West");
            default -> System.out.println("Not Valid");
        }
        enum Month 
        {
            JAN, FEB, MAR, MAY
        }
        System.out.println("Months" +Month.MAY);

    }
    
}
