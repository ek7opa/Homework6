package shapes;

public class Rectangle {
	private int width;
	private int height;
	public Rectangle (int getWidth,int getHeight){
		width = getWidth;
		height = getHeight;
	}
	public int getArea(){
		return width * height;
	}
}
