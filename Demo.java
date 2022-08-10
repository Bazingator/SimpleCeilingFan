public class Demo {

	public static void main(String[] args) {
		CeilingFan fan = new CeilingFan();
		System.out.println("Ceiling fan created.");
		System.out.println(fan.getStatus());
		
		System.out.println("Pulling speed and direction cord once.");
		fan.pullDirectionCord();
		fan.pullSpeedCord();
		System.out.println(fan.getStatus());
		
		System.out.println("Pulling speed cord twice.");
		fan.pullSpeedCord();
		fan.pullSpeedCord();
		System.out.println(fan.getStatus());
		
		System.out.println("Pulling speed and direction cord once.");
		fan.pullDirectionCord();
		fan.pullSpeedCord();
		System.out.println(fan.getStatus());
		
		System.out.println("Pulling speed cord 4 times and direction cord once.");
		fan.pullDirectionCord();
		fan.pullSpeedCord();
		fan.pullSpeedCord();
		fan.pullSpeedCord();
		fan.pullSpeedCord();
		System.out.println(fan.getStatus());
	}

}
