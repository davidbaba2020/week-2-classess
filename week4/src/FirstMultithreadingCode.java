
public class FirstMultithreadingCode extends Thread{

    public static void main(String[] args) {

        //First way to create threads in java: Using an external class
        Runnable task = new DefaultRunnable();
        Thread t1 = new Thread(task);

        //Second way to create threads in java: By passing instance of an anonymous class to the thread instance
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am a new thread! My name is " + Thread.currentThread().getName());
            }
        });

        //Third way to create threads in java: Extend the class and overide the run method
        Thread t3 = new FirstMultithreadingCode();

        //Forth way to create threads in java: By using lambda expression
        Thread t4 = new Thread(()-> System.out.println("I am a new thread! My name is " +
                Thread.currentThread().getName()));

        //Fifth way to create threads in java: By using method reference
        Thread t5 = new Thread(FirstMultithreadingCode::execute);



        System.out.println("The current thread name is: " +Thread.currentThread().getName());

        t1.run();//  Will start the thread on main method
        //start() starts a new thread of execution
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    private static void execute() {
        System.out.println("I am a new thread! My name is " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("I am a new thread! My name is " + Thread.currentThread().getName());
    }
}
