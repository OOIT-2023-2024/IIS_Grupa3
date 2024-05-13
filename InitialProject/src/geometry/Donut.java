package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Donut extends Circle {
	// ostali property se nasleđuju od Circle
	private int innerRadius;

	public Donut() {
		// u pozadini poziva super()
	}

	public Donut(int innerRadius) {
		// u pozadini poziva super()
		this.innerRadius = innerRadius;
	}

	public Donut(Point center, int radius, int innerRadius) {
		// poziva konstruktor iz direktno nadređene klase
		// mora da bude prva naredba
		super(center, radius);
		this.innerRadius = innerRadius;
	}

	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);

		// ovako treba kad je selected private
		// demonstracija
		/*
		 * this.setSelected(selected); super.setCenter(center); setSelected(selected);
		 */

		// ovako moze kad je selected protected
		this.selected = selected;
		// super.selected = selected;
	}

	public double area() {
		return super.area() - innerRadius * innerRadius * Math.PI;
	}

	public double circumference() {
		return super.circumference() + 2 * innerRadius * Math.PI;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Donut) {
			Donut pomocna = (Donut) obj;
			if (getCenter().equals(pomocna.getCenter()) && getRadius() == pomocna.getRadius()
					&& innerRadius == pomocna.getInnerRadius())
				return true;
			else
				return false;
		} else
			return false;
	}

	public boolean contains(int x, int y) {

		return super.contains(x, y) && getCenter().distance(new Point(x, y)) >= innerRadius;
	}

	public boolean contains(Point p) {

		return this.contains(p.getX(), p.getY());
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(getCenter().getX()-innerRadius, getCenter().getY()-innerRadius,
				innerRadius*2, innerRadius*2);	
		
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() - innerRadius - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() + innerRadius - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() - innerRadius - 2, 4, 4);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() + innerRadius - 2, 4, 4);
			g.setColor(Color.black);
		}
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Donut) {
			Donut shapeToCompare = (Donut)obj;
			return (int)(this.area() - shapeToCompare.area());
		}
		return 0;
	}

	// ostale get i set metode se nasleđuju
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

	public String toString() {
		// ako bismo pozvali toString() desila bi se rekurzija
		return super.toString() + ", innerRadius = " + innerRadius;
	}

}
