/*Bassem El-Sayed
  Mr. Harwood
  jan 20 2022
 */
package grade12;

public class Elevator {
	final static String manufacturer = "Otis";
	final static int topFloor = 19;
	//Max Occupants
	final static int occ = 25;
	static boolean powerON = true;
	private int floor = 1;
	private int people = 0;
	private boolean doorsOpen = false;

	Elevator(int floor){
		if (floor < 0 || floor > topFloor) {
			this.floor = 1;
			return;
		}
		this.floor = floor;
	}
	Elevator(){
		this.floor = 1;
	}
	
	static void setPowerState(boolean status) {
		if(!status && status != powerON) 
			System.out.println("The power is now ON");
		else if (status != powerON)
			System.out.println("The power is now OFF");
		
		powerON = status;
	}
	
	static void getPowerState() {
		if(powerON) 
			System.out.println("The power is ON");
		else 
			System.out.println("The power is OFF");
		
	}
	
	void up() {
		if (floor+1 > topFloor) {
			System.out.println("Floor goes out of range 1-"+topFloor);
			return;
		} else if (doorsOpen) {
			System.out.println("Doors are open!");
			return;
		} else if (!powerON) {
			System.out.println("The power is OFF!");
			return;
		}
		floor++;
	}
	
	void openDoors() {
		if (!powerON) {
			System.out.println("Power is OFF!");
			return;
		} if (doorsOpen) {
			System.out.println("Doors are already open");
			return;
		}
		doorsOpen = true;
	}
	
	void closeDoors() {
		if (!powerON) {
			System.out.println("Power is OFF!");
			return;
		} if (!doorsOpen) {
			System.out.println("Doors are already closed");
			return;
		}
		doorsOpen = false;
	}
	
	void down() {
		if (floor-1 < 0) {
			System.out.println("Floor goes out of range 1-"+topFloor);
			return;
		} else if (doorsOpen) {
			System.out.println("Doors are open!");
			return;
		} else if (!powerON) {
			System.out.println("The power is OFF!");
			return;
		}
		floor--;
	}
	
	void goToFloor(int n) {
		if (n < 0 || n > topFloor) {
			System.out.println("Floor goes out of range 1-"+topFloor);
			return;
		} else if (doorsOpen) {
			System.out.println("Doors are open!");
			return;
		} else if (!powerON) {
			System.out.println("The power is OFF!");
			return;
		}
		this.floor = n;
	}
	
	void addPeople (int amount) {
		if (!doorsOpen) {
			System.out.println("Doors are closed!");
			return;
		} else if (people+amount > occ) {
			System.out.println("Amount goes above occupation limit!");
			return;
		} else if (amount < 0) {
			System.out.println("Amount cannot be less than 0!");
			return;
		}
		people += amount;
	}
	
	void removePeople (int amount) {
		if (!doorsOpen) {
			System.out.println("Doors are closed!");
			return;
		} else if (people-amount < 0) {
			System.out.println("Amount goes below 0!");
			return;
		} else if (amount < 0) {
			System.out.println("Amount cannot be less than 0!");
			return;
		}
		people -= amount;
	}
	
	@Override
	public String toString() {
		return "Manufacturer: " + manufacturer + ", " + "Number of people: " + people + ", Doors open: " + doorsOpen;
	}


}
