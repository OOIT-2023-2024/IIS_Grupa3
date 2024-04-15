package geometry;

import java.awt.Graphics;

public class Line extends Shape{

	private Point startPoint;
	private Point endPoint;

	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		// this je poziv konstruktora klase Line
		this(startPoint, endPoint);
		this.selected = selected;
	}

	public double length() {
		return startPoint.distance(endPoint);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line pomocna = (Line) obj;
			if (this.startPoint.equals(pomocna.startPoint) && this.endPoint.equals(pomocna.endPoint)
					&& this.selected == pomocna.selected)
				return true;
		}
		return false;
	}

	public boolean contains(int x, int y) {
		Point tackaKlika = new Point(x, y);
		return this.startPoint.distance(tackaKlika)
				+ this.endPoint.distance(tackaKlika)
				- length() <= 2;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(),
				endPoint.getX(), endPoint.getY());		
	}

	public Point getStartPoint() {
		// vraca objekat klase Point odnosno pocetnu tacku linije
		return this.startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}


	public String toString() {
		return this.startPoint.toString() + "-->" + this.endPoint;
	}

}
