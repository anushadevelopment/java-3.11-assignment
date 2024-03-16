public class Loops {
    public static void main(String[] args) {
        // for (int i=0; i < 5; i++){
        //     System.out.println(" i : " +i);
        // }

        boolean isRunning = true;
        int i=0;

        while(isRunning){
            
            if (i == 5){
                isRunning = false;
            }
            System.out.println("i : " + i);
            ++i;
            
        }
        int j=0;
        boolean isActive = false;
        do {
            if (j == 5){
                isActive = false;
            }
            System.out.println("j :" +j);
            j++;
        }while(isActive);
       
        for (int x=0; x < 5; x++){
            if ( x==5 ){
                break;
            }
            System.out.println(" x : " +x);
        }
        for (int y=0; y < 10; y++){
            if ( y==5 ){
                continue;
            }
            System.out.println(" y: " +y);
        }

    
        
    }
    
}


