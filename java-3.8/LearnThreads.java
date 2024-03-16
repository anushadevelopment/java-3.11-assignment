public class LearnThreads {

    public static void main(String[] args) {
        System.out.println("Application Started");
        // simulateLongDelay(5000, "Completed Time Intensive Task");

        MyFirstThread myFirstThread = new MyFirstThread();
        myFirstThread.start();
        // myFirstThread.run();

        Thread runnableThread = new Thread(new MyFirstRunnable());
        runnableThread.start();

        Thread anonymousRunnableThread = new Thread(new Runnable() {

            @Override
            public void run() {
                LearnThreads.simulateLongDelay(5000, Thread.currentThread().getName() + ": Completed Time Intensive Task using Anonymous Class.");
            }
        });
        anonymousRunnableThread.start();

        Thread lambdaRunnableThread = new Thread(() -> {
            LearnThreads.simulateLongDelay(5000, Thread.currentThread().getName() + ": Completed Time Intensive Task using Lambda Expression.");
        });
        lambdaRunnableThread.start();

        new Thread(() -> {
            LearnThreads.simulateLongDelay(5000, Thread.currentThread().getName() + ": Simple Thread using Lambda Expression");
        }).start();

        System.out.println(Thread.currentThread().getName() + ": Hello World!!");
    }

    public static void simulateLongDelay(int milliseconds, String message) {
        // get the current time in milliseconds
        long startTime = System.currentTimeMillis();

        // Loop unitl the specified number of milliseconds have passed.
        while(System.currentTimeMillis() - startTime < milliseconds){
            // do nothing.
        }

        System.out.println(message);
    }
}