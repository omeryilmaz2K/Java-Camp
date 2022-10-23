package intro_oop_inheritance2;

public class EmailLogger extends Logger {
	
	@Override
	public void log() {
		super.log();
		System.out.println("Eposta olarak log'landı.");
	}
}
