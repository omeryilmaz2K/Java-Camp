package intro_oop_with_nlayered.core.logging;

public class EmailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Eposta olarak log'landı: " + data);
	}
}
