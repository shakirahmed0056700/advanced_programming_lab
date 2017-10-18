package labwork;

public class Vehicle implements vehicle_interface {

	public Object Car;
	public Object Bus;

	public Object Ship;
	public Object Boat;

	public Object aeroPlane;
	public Object helicopter;


	public void speed(int spd) {
		// TODO Auto-generated method stub
		System.out.println("Speed is : " +spd);

	}

	public boolean isRunning() {
		// TODO Auto-generated method stub
		System.out.println("Running : ");
		return true;
	}



}

