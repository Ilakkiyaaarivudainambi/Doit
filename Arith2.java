package teleapps;

public class Arith2 {
	public static void main(String[] args) throws InterruptedException {

		Arithmetic N = new Arithmetic();
		Subtraction N1 = new Subtraction();
		Multiplication N2 = new Multiplication();
		Division N3 = new Division();
		N.setPriority(8);
		N1.setPriority(2);
		N2.setPriority(1);
		N3.setPriority(4);
		System.out
				.println(N.getPriority() + "\n" + N1.getPriority() + "\n" + N2.getPriority() + "\n" + N3.getPriority());
		System.out.println(Thread.currentThread().getName());
		N.start();
		Thread.sleep(2000);
		N1.start();
		N2.sleep(10000);
		System.out.println(N2.toString());
		System.out.println(N1.isAlive());
		N2.start();
		N3.start();

	}
}
