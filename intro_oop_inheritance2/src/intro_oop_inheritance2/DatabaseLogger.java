package intro_oop_inheritance2;

public class DatabaseLogger extends Logger {
	
	@Override
	public void log() {
		super.log();
		System.out.println("Veri tabanına log'landı.");
	}
}
