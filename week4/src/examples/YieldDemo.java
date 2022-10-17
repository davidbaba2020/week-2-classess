package examples;

public class YieldDemo {

	public static void main(String[] args) {
		var t0 = new Thread(() -> {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		});

		var t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
	
		t0.start();
		t1.start();
	}

}






//WHAT THEN IS THE USE OF THE YIELD METHOD IF IT DOES NOT AFFECT THE ORDER OF THREAD EXECUTION?
//THE EXECUTION ALGORITHM OF TIME SLICING AND OTHER FACTORS COULD BE THE REASON FOR ALL THESE