package mediatorPattern;

public class MediatorPatternDemo {
	public static void main(String[] args) throws InterruptedException {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		Thread.sleep(1000);
		john.sendMessage("Hello! Robert!");
	}
}