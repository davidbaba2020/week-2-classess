public class DefaultRunnable implements Runnable {
        private String externalString;

    public DefaultRunnable() {
    }

    public DefaultRunnable(String externalString) {
        this.externalString = externalString;
    }

    @Override
    public void run() {
        System.out.println("I am a new thread! My name is " + Thread.currentThread().getName());
    }
}
