import java.util.concurrent.TimeUnit;

public class InterruptThreadDemo2 implements Runnable{
    @Override
    public void run() {

        try{
            System.out.println("In rum() - about to work()");
            work();
            System.out.println("In run() - back from work() - this line will not be executed");
        }catch (InterruptedException x){
            System.out.println("In run() - interrupted in work()");
            return;
        }
        System.out.println("In run() - doing stuff afternap");
        System.out.println("In run() - leaving normally");

    }

    private void work() throws InterruptedException{
        while (true) {
            System.out.println("Working...");
            if(Thread.currentThread().isInterrupted()) {
                System.out.println("IsInterrupted() = "+ Thread.currentThread().isInterrupted());
//                System.out.println("Interrupted() = " + Thread.interrupted());
//                System.out.println("iSInterrupted() = " + Thread.currentThread().isInterrupted());

                TimeUnit.MILLISECONDS.sleep(1);
                System.out.println("This line won't be executed");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptThreadDemo2 runnableTask = new InterruptThreadDemo2();
        Thread thread = new Thread(runnableTask);
        thread.start();

        Thread.sleep(2000);
//        TimeUnit.MILLISECONDS.sleep(2000);
//        TimeUnit.SECONDS.sleep(2);

        System.out.println("In main thread() - interrupting other threads");
        thread.interrupt();

        thread.join();
        System.out.println("In main() - leaving");
    }
}

// RACE CONDITION
//if (x == 5) // The "Check"
//        {
//        y = x * 2; // The "Act"
//
//        // If another thread changed x in between "if (x == 5)" and "y = x * 2" above,
//        // y will not be equal to 10.
//        }
