package grade12;

public class ElevTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator south = new Elevator();
		Elevator east = new Elevator(5);
		
		south.openDoors();
		south.addPeople(10);
		south.toString();
		
		south.closeDoors();
		south.goToFloor(4);
		south.openDoors();
		south.removePeople(3);
		south.toString();
		
		south.closeDoors();
		south.goToFloor(19);
		south.openDoors();
		south.removePeople(7);
		south.toString();
		
		east.openDoors();
		east.addPeople(8);
		east.toString();
		
		east.closeDoors();
		east.goToFloor(8);
		east.openDoors();
		east.addPeople(30);
		east.toString();
		
		east.closeDoors();
		east.goToFloor(20);
		east.goToFloor(-1);
		
		south.closeDoors();
		south.goToFloor(2);
		east.goToFloor(2);
		
		east.openDoors();
		Elevator.setPowerState(false);
		
		east.closeDoors();
		south.closeDoors();
		
		Elevator.setPowerState(true);
		Elevator.setPowerState(true);
		
		south.down();
		south.openDoors();
		
		for (int i=0; i<9; i++) {
			south.closeDoors();
			south.up();
			south.openDoors();
		}
		
	}

}
