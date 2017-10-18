package labwork;

public class Land extends Vehicle{

	
	Land Car = new Land();
	Land Bus = new Land();
	
	public Land() {
		Car.speed(40);
		Car.isRunning();
		Bus.speed(80);
		Bus.isRunning();
	}
	
}
