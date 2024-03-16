import java.util.ArrayList;
import java.util.Arrays;

import javax.sound.midi.Soundbank;
public class LearnArrayList {
    public static void main(String[] args) {

       ArrayList<String> nameList = new ArrayList<String>();

       nameList.add("Apple");
       nameList.add("Orange");
       nameList.add("Banana");

       System.out.println(nameList.get(0));
       System.out.println(nameList.get(1));

      nameList.set(0, "Lemon");
      System.out.println(nameList.get(0));

      nameList.remove(2);
      System.out.println(nameList);

      System.out.println("Size of name List : " +nameList.size());


      ArrayList<String> wildAnimals = new ArrayList<>(Arrays.asList("Lion", "Bear","Cheetah"));
      ArrayList<String> domesticAnimals = new ArrayList<>(Arrays.asList("cat", "cow", "goat"));

      ArrayList<String> animals = new ArrayList<String>();
      animals.addAll(wildAnimals);
      animals.addAll(domesticAnimals);

      System.out.println("Animals :" + animals);

      System.out.println(" Contains of  Lion : " + animals.contains("Lion"));
      System.out.println(" Contains of  lion : " + animals.contains("lion"));

      System.out.println("Index of Lion " + animals.indexOf("Lion")); // will return the first occurrence from the list
      System.out.println("Index of Lion " + animals.indexOf("lion")); // returns -1 if not found
      

      animals.add("Lion");

      System.out.println("Last Index of Lion :" + animals.lastIndexOf("lion"));

      animals.removeAll(domesticAnimals);
      System.out.println("Animals after removed domestic animals :" + animals);








    }
    
}
