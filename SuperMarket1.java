package teleapps;

public class SuperMarket1 extends Thread {
	public void run() {
		SuperMarket.beverges();
	}
}

class SuperMarket2 extends Thread {
	public void run() {
		SuperMarket.Sauce();
	}
}

class SuperMarket3 extends Thread {
	public void run() {
		SuperMarket.diary();
	}
}