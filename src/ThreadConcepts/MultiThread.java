package ThreadConcepts;

public class MultiThread extends Thread{ //method1 of doing thread, we need to extend form thread class

    private int threadNumber;
    public MultiThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1 ; i<=5; i++) {
           // System.out.println(i);

            System.out.println(i + " from thread " + threadNumber);
        }
        try {
            Thread.sleep(2000); //thread sleep must be surrounded with
        }

        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
