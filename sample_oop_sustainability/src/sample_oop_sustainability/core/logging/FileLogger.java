package sample_oop_sustainability.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Dosyaya log'landı: " + message);
	}

}
