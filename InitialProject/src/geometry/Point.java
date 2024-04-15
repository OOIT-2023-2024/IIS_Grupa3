package geometry;

import java.awt.Graphics;

public class Point extends Shape {
	// property klase point - PRIVATE
	// podrazumevane vrednosti: 0 0 false
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		// u pozadini poziva
		super();
		this.x = x;
		this.y = y;
	}

	// dozvoljava ali nam je nepotrebno
	public Point(int x) {
		this.x = x;
	}

	/*
	 * ne dozvoljava public Point(int xKoordinata, int y) { this.x = xKoordinata;
	 * this.y = y; }
	 */

	/* tip parametara se razlikuje pa moze */
	// moze ali nije ispravno
	/*
	 * public Point(int xKoordinata, String y) { // } public Point(String y, int
	 * xKoordinata) { // }
	 */

	public Point(int x, int y, boolean selected) {
		/*
		 * this.x = x; this.y = y;
		 */
		// nasledjivanje konstruktora
		this(x, y);
		this.selected = selected;
	}

	public double distance(Point udaljenaTacka) {
		// this.x je x koordinata tacke nad kojom
		// je pozvana metoda distance u klasi Test
		int a = this.x - udaljenaTacka.x;
		int b = this.y - udaljenaTacka.y;
		double distance = Math.sqrt(a * a + b * b);
		return distance;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			if (this.x == ((Point) obj).x && this.y == ((Point) obj).y && this.selected == ((Point) obj).selected) {
				return true;
			}
			return false;
		}

		return false;
	}

	public boolean contains(int x, int y) {
		Point tackaKlika = new Point(x, y);
		return this.distance(tackaKlika) <= 2;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y-2, x, y+2);
	}

	// metode pristupa - PUBLIC
	public int getX() {
		return x;
		// return this.x; --moze i ovako
	}

	public void setX(int x) {
		// property x klase Point = prosleđeno x metodi
		this.x = x;
		// x=x;--ne valja
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}


}
