package sample_oop_sustainability.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Veri tabanına log'landı: " + message);
	}

}
