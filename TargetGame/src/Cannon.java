import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Cannon {
	private int x;
	private int y;
	private int s;
	private float angle;
	private float angleSpeed;
	
	public Cannon(int x, int y, int s) {
		this.x = x;
		this.y = y;
		this.s = s;
	}
	
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillRect(x, y, s, s);
		gc.fillRect((x+s/2)-5, y-10, 10, 10);
	}
	
	public boolean shoot() {
		return true;
	}
	
	public void rotate(GraphicsContext gc){
		//gc.translate(x,y);
		gc.rotate(45);
		gc.fillRect(0, 0, s, s);
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

	public float getAngle() {
		return angle;
	}

	public void setAngle(float angle) {
		this.angle = angle;
	}

	public float getAngleSpeed() {
		return angleSpeed;
	}

	public void setAngleSpeed(float angleSpeed) {
		this.angleSpeed = angleSpeed;
	}
}