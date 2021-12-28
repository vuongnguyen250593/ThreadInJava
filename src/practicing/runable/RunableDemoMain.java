package practicing.runable;

public class RunableDemoMain {
    public static void main(String[] args) {
        System.out.println("Main thead running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR_Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Main thread stopped");
    }
}
