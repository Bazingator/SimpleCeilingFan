
public class CeilingFan {
	// Fan variables
	private int speed;
	private String direction;
	
	public CeilingFan() {
		// Setting fan variables
		speed = 0;
		direction = "clockwise";
	}
	
	public void pullSpeedCord() {
		// Increase speed and reset to 0 if at max speed
		speed++;
		if (speed == 4) speed = 0;
	}
	
	public void pullDirectionCord() {
		// Change direction of fan
		if (direction.equals("clockwise")) direction = "counter clockwise";
		else direction = "clockwise";
	}
	
	// Returns current status of fan
	public String getStatus() {
		return String.format("The ceiling fan is currently spining %s with a speed of %d", direction, speed);
	}
}
