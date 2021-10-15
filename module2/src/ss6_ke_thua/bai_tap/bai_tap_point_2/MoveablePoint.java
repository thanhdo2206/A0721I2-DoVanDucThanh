package ss6_ke_thua.bai_tap.bai_tap_point_2;

public class MoveablePoint extends Point {
	private float xSpeed,ySpeed;
	
	public MoveablePoint(float x, float y,float xSpeed, float ySpeed) {
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public MoveablePoint(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public MoveablePoint() {}

	public float getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getySpeed() {
		return ySpeed;
	}

	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public void setSpeed(float xSpeed , float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public float[] getSpeed() {
		float[] arr = {this.xSpeed,this.ySpeed};	
		return arr;
	}
	
	@Override
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + "),speed = (" + this.xSpeed + "," + this.ySpeed+")";
	}
	
	public MoveablePoint move() {
		float x = this.getX();
		float y = this.getY();
		x+= this.xSpeed;
		y+=this.ySpeed;
		return this;
		
	}
	
	
	
	
	
	
	
	
}
