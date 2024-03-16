import java.util.Arrays;
import java.util.ArrayList;

import javax.sound.midi.Soundbank;

public class LearnLoops {
    public static void main(String[] args) {
        int[] scoresList =  new int[] {1,2,3,4,4,5,6,};

        for(int i=0; i<scoresList.length;i++){
            System.out.println("Arrays scoreList : "+scoresList[i]);ß

        }

        ArrayList<String> heroes = new ArrayList<>(Arrays.asList("Ironman", "Thor", "Captain America", "Thor", "Hulk", "Black Widow", "Hawkey"));

        for (int i=0; i<heroes.size();i++){
            System.out.println("Usual For loop method : "+ heroes.get(i));
        }

        for(int score : scoresList){
            System.out.println(score);

        }
        for(String hero : heroes){
            System.out.println(hero);
        }
    


    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //Display all the numbers
        numbers.forEach((number) -> System.out.println(number));

        System.out.println();

        // Display all the even numbers
        numbers.forEach((number) -> {
            if(number % 2 == 0) {
                System.out.println(number);
            }
        });

        // Remove all the odd numbers
        numbers.removeIf((number) -> number % 2 != 0);

        System.out.println(numbers);

    }
    
}
