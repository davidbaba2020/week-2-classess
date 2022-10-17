package examples;

public class PriorityDemo {

	
	public static void main(String[] args) {
		var t0 = new Thread(PriorityDemo::execute);
		var t1 = new Thread(PriorityDemo::execute);
		var t2 = new Thread(PriorityDemo::execute);
		var t3 = new Thread(PriorityDemo::execute);
		var t4 = new Thread(PriorityDemo::execute);
		var t5 = new Thread(PriorityDemo::execute);
		
		t0.setPriority(1);
		t1.setPriority(10);
		t2.setPriority(10);
		t3.setPriority(3);
		t4.setPriority(6);
		t5.setPriority(4);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

	public static void execute() {
		System.out.println(Thread.currentThread().getName());
	}

}







		//WHY ARE THREADS WITH PRIORITY NOT RUN IN THE ORDER OF THEIR PRIORITY?
		//		- time slot for each thread are not infinite
		//		- You can't always predict the sequence of multithreading execution
		//		- That Y U must learn to write multithreading apps that will not depend
		//		   on sequence of execution to avoid race conditions and unexpected impact
		//		   on the output of our app execution


