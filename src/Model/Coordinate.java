package Model;

public class Coordinate {
	private int x;
	private int y;

	public Coordinate(int x, int y) {// 생성자
		this.x = 0;
		this.y = 0;
	}

	public void goRight() {
		
		this.y = this.y + 1;
		System.out.println(":" + x + "," + y + "로 이동했습니다.");
	}

	public void goDown() {
		this.x = this.x + 1;
		
		System.out.println(":" + x + "," + y + "로 이동했습니다.");
	}

	public double getDistance(Coordinate target) {// 생성자
		int xDiffer = target.x - x;
		int yDiffer = target.y - y;
		return Math.sqrt(Math.pow(xDiffer, 2) + Math.pow(yDiffer, 2));

	}
//getter, setter는 뒤에있는게 좋움.
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
