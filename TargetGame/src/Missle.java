import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Missle {
	private int x;
	private int y;
	private int s;
	private double speedX;
	private double speedY;
	
	public Missle(int x, int y, int s) {
		this.x = x;
		this.y = y;
		this.s = s;
	}
	
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.DARKBLUE);
		gc.fillRect(x, y, s/2, s);
	}
	
	public boolean didHit() {
		return true;
	}

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

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public double getSpeedX() {
		return speedX;
	}

	public void setSpeedX(double speedX) {
		this.speedX = speedX;
	}

	public double getSpeedY() {
		return speedY;
	}

	public void setSpeedY(double speedY) {
		this.speedY = speedY;
	}
}