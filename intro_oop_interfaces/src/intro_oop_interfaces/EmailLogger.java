package intro_oop_interfaces;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Eposta olarak log'landı: " + message);
	}
}
