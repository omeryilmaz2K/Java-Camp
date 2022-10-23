package intro_oop_inheritance2;

public class FileLogger extends Logger {
	
	@Override
	public void log() {
		super.log();
		System.out.println("Dosyaya log'landı.");
	}
}
