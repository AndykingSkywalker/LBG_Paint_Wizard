package paintWizard;

public class Room {

	private int numOfWalls;
	private double wallHeight;
	private double wallWidth;

	public Room() {
		super();
	}

	public Room(int numOfWalls, double wallHeight, double wallWidth) {
		super();
		this.numOfWalls = numOfWalls;
		this.wallHeight = wallHeight;
		this.wallWidth = wallWidth;
	}

	public int getNumOfWalls() {
		return numOfWalls;
	}

	public void setNumOfWalls(int numOfWalls) {
		this.numOfWalls = numOfWalls;
	}

	public double getWallHeight() {
		return wallHeight;
	}

	public void setWallHeight(double wallHeight) {
		this.wallHeight = wallHeight;
	}

	public double getWallWidth() {
		return wallWidth;
	}

	public void setWallWidth(double wallWidth) {
		this.wallWidth = wallWidth;
	}

}
