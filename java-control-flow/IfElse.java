import javax.sound.sampled.SourceDataLine;

public class IfElse {
    public static void main(String[] args) {
        int budget = 1000;
        int expense = 90;

        if (budget > expense)
        {
            System.out.println("You are withing the budget");
        }else{
            System.out.println("You are over budget");
        }
    


    int age = 20;
    int weight = 120;

        if (age > 18){
            if(weight >100){
                System.out.println("You are eligible to donate blod");
            }
            else{
                System.out.println("You are not eligible to donate blood");
            }

        } else{
            System.out.println("you are too little to donate blood");
            }

            String myfruit = "apple";
            String hisFruit = "apple";
            System.out.println("myFruit == HisFruti : " + myfruit == hisFruit);
            System.out.println("myFruit.equals(hisFruit) : "+ myfruit.equals(hisFruit));

}
}



