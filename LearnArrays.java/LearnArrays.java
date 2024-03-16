import java.util.Arrays;


public class LearnArrays {
    public static void main(String[] args) {
        // Declare array of int
        int[] ageList;

        // Declare array of String
        String[] namesList;

        // Alternate syntax
        String namesArray[];
        
        // How to instantiate array
        int[] scoresList = new int[5];
        Integer[] scoresList2 = new Integer[5];

        // Instantiate array of 10 Strings
        String[] studentsList = new String[10];

        String[] favMovies;
        
        favMovies = new String[] {"Avengers", "Infinity War", "Iron Man"};

        System.out.println(favMovies[0]);
        System.out.println(favMovies[1]);
        System.out.println(favMovies[2]);

        favMovies[0] = "Endgame";
        System.out.println(favMovies[0]);
        System.out.println(favMovies.length);

        // favMovies[3] = "Captain America"; // Gives error

        // favMovies[0] = 1;

        System.out.println(favMovies);
        System.out.println(scoresList);  
        
        System.out.println(Arrays.toString(scoresList));
        System.out.println(Arrays.toString(scoresList2));



        scoresList = new int[] {7,3,8,4,5};
        System.out.println("Arrays before sort : " +Arrays.toString(scoresList));
        Arrays.sort(scoresList);
        System.out.println("After sort : " +Arrays.toString(scoresList));
        // Arrays.fill(scoresList, 100);
        // System.out.println("After fill :" +Arrays.toString(scoresList));
       
        String[] fruits = {"Apple", "Banana", "PineApple", "Orange"};
        System.out.println("Fruits : " +Arrays.toString(fruits));

        String[] fruitsCopy = Arrays.copyOf(fruits, fruits.length);
        System.out.println(" Fruits Copy  : " + Arrays.toString(fruitsCopy));


        String[] fruitsPartialCopy = Arrays.copyOf(fruits,2);
        System.out.println("Fruits Partially copied :" +Arrays.toString(fruitsPartialCopy));

        String[] fruitsExtendedCopy = Arrays.copyOf(fruits,fruits.length + 2);
        System.out.println("Fruits Extended copy : " + Arrays.toString(fruitsExtendedCopy));

        System.out.println("Copy of Range : " +Arrays.toString(Arrays.copyOfRange(fruits, 0, 2)));

        System.out.println("Binary search : Apple " + Arrays.binarySearch(fruits, "apple"));
        System.out.println("Binary search : Apple " + Arrays.binarySearch(fruits, "Apple"));

        System.out.println("Arrays Compare : " + Arrays.equals(fruits, fruitsCopy));   // return true

        System.out.println("Arrays Compare : " + (fruits == fruitsCopy));  //false 


    }
}
