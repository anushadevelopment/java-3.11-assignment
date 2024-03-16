import java.io.Console;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class ArrayActivity {
    public static void main(String[] args) {

        ArrayList suspectNames = new ArrayList<>();
        ArrayList ailbiNames = new ArrayList<>();
        boolean enterSuspects = true;
        boolean enterAilbi = true;
        while (enterSuspects) {
            String name = System.console().readLine(" Enter the suspects names , blank if done: ");
            if (!name.equals("")) {
                suspectNames.add(name);
                System.out.println(name);
            } else {
                enterSuspects = false;
            }
        }

        while (enterAilbi) {
            String aname = System.console().readLine("Enter the suspect with alibi Names , blank if done:");
            if (!aname.equals("")) {
                ailbiNames.add(aname);
                if (suspectNames.contains(aname)){
                    suspectNames.remove(aname);
                }
                else{
                    System.out.println(aname + " is not a suspect");
                }
            } else {
                enterAilbi = false;
            }

        }

        System.out.println(" Suspects List :" + suspectNames);
    }

}












// import java.util.ArrayList;

// public class ArrayActivity {
//     public static void main(String[] args) {
//         ArrayList<String> suspectLists = new ArrayList<> ();
//         String suspectInput = null;
//         System.out.println("🕵🏽‍♂️ Welcome Detective! Let's catch some bad guys today!");
//         do {
//             suspectInput = System.console().readLine("🧐 Enter a suspect, blank if done: ");
//             if(!suspectInput.isBlank()) {
//                 if(suspectLists.contains(suspectInput)){
//                     System.out.println("😒 Suspect " + suspectInput + " already exists.");
//                 }else {
//                     suspectLists.add(suspectInput);
//                 }
//             }
//         } while(!suspectInput.isBlank() || suspectInput == null);

//         System.out.println("👿 Suspect Lists: ");
//         System.out.println(suspectLists);
        
//         String alibiInput = null;
//         do {
//             alibiInput = System.console().readLine("🎉 Enter a suspect with an alibi, blank if done: ");
//             if(!alibiInput.isBlank()){
//                 if(suspectLists.contains(alibiInput)) {
//                     suspectLists.remove(alibiInput);
//                 } else {
//                     System.out.println("🤔 " + alibiInput + " is not a suspect.");
//                 }
//             }
//         } while(!alibiInput.isBlank() || alibiInput == null);

//         System.out.println("😈 Updated Suspect Lists: ");
//         System.out.println(suspectLists);

//         String culprit = "";
//         for(String suspect : suspectLists) {
//             if(suspect.length() > culprit.length()) {
//                 culprit = suspect;
//             }
//         }
        
//         if(suspectLists.isEmpty()) {
//             System.out.println("😥 There's no suspect who is a culprit");
//         } else {
//             System.out.println("🫣 The culprit is " + culprit + " because his name is " + culprit.length() + " letters long.");
//         }
        
//     }
// }
