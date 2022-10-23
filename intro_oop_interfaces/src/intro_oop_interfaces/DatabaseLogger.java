package intro_oop_interfaces;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Veri tabanına log'landı: " + message);
	}
}
