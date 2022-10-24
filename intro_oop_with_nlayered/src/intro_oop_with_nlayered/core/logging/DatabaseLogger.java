package intro_oop_with_nlayered.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına log'landı: " + data);
	}
}
