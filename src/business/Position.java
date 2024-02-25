package business;

public class Position {

	private int x;
	private int y;

	public Position() {
	}

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	public void setX(int x){
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}

	public boolean equals(Position p2) {
		return (x == p2.x && y == p2.y);
	}
}