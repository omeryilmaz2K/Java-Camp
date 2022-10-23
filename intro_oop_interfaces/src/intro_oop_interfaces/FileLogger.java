package intro_oop_interfaces;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Dosyaya log'landı: " + message);
	}
}
