package ThreadConcepts;

public class MultiThreading {
    public static void main(String[] args) {
       /* MultiThread obj = new MultiThread();
        MultiThread obj1 = new MultiThread();

        obj.start();
        obj1.start(); */

        for (int i = 0; i<=5; i++) {
            MultiThread thread = new MultiThread(i);

            //to start thread

            thread.start();
        }
        throw new RuntimeException();
    }
}
