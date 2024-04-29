package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape{
	private Point upperLeftPoint;
	private int width;
	private int height;
	private boolean selected;

	public Rectangle() {

	}

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height);
		this.selected = selected;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle) obj;
			if (this.upperLeftPoint.equals(pomocna.upperLeftPoint) && this.width == pomocna.width
					&& this.height == pomocna.height && this.selected == pomocna.selected)
				return true;
		}
		return false;
	}

	public boolean contains(int x, int y) {
		return (x >= this.upperLeftPoint.getX()
				&& x <= this.upperLeftPoint.getX() + width
				&& y >= this.upperLeftPoint.getY() 
				&& y <= this.upperLeftPoint.getY() + height);
	}
	
	//overloading moze i nad metodama koje nisu konstruktori
	public boolean contains(Point tackaKlika) {
		return (tackaKlika.getX() >= this.upperLeftPoint.getX()
				&& tackaKlika.getX() <= this.upperLeftPoint.getX() + width
				&& tackaKlika.getY() >= this.upperLeftPoint.getY() 
				&& tackaKlika.getY() <= this.upperLeftPoint.getY() + height);
	}

	public int area() {
		return width * height;
	}

	public int circumference() {
		return 2 * width + 2 * height;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(upperLeftPoint.getX(), upperLeftPoint.getY(),
				width, height);	
	}
	
	@Override
	public void moveTo(int x, int y) {
		upperLeftPoint.moveTo(x, y);
	}

	@Override
	public void moveBy(int x, int y) {
		upperLeftPoint.moveBy(x, y);
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle shapeToCompare = (Rectangle)obj;
			return this.area() - shapeToCompare.area();
		}
		return 0;
	}

	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}

	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String toString() {
		return "Upper left point: " + upperLeftPoint 
				+ ", width = " + width 
				+ ", height = " + height;
	}
}
