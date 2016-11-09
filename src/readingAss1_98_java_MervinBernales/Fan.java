/**
 * 
 */
package readingAss1_98_java_MervinBernales;

/**
 * @author Mervin
 *
 */
public class Fan {
	final static int SLOW = 1,MEDIUM = 2,FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	public int getSpeed(){
		return speed;
	}
	public boolean getOn(){
		return on;
	}
	public double getRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	public void setSpeed(int _speed){
		speed = _speed;
	}
	public void setOn(boolean _on){
		on = _on;
	}
	public void getRadius(double _radius){
		radius = _radius;
	}
	public void setColor(String _color){
		color = _color;
	}
	Fan(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	Fan(int _speed, boolean _on, double _radius, String _color){
		speed = _speed;
		on = _on;
		radius = _radius;
		color = _color;
	}
	public String toString(){
		if(on == true){
			return("fan is on"+ "\n fan speed: " + speed + "\n Color: " + color + "\n Radius: " + radius);

		}
		else{
			return("fan is off"+ "\n Color: " + color + "\n Radius: " + radius);
		}
		
	}
}
