package intro_oop_with_nlayered.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya log'landı: " + data);
	}
}
