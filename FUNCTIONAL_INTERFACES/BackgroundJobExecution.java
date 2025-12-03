public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Job running asynchronously");
        new Thread(job).start();
    }
}