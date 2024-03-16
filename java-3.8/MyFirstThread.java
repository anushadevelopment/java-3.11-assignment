public class MyFirstThread extends Thread {
    
    @Override
    public void run(){
        LearnThreads.simulateLongDelay(5000, Thread.currentThread().getName() + ": Intensive task completed with Thread subclass.");
    }
}
