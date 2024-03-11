package geometry;

public class Point {
	//property klase point - PRIVATE
	//podrazumevane vrednosti: 0 0 false
	private int x;
	private int y;
	private boolean selected;	
	
	public double distance(Point udaljenaTacka) {
		//this.x je x koordinata tacke nad kojom
		//je pozvana metoda distance u klasi Test
		int a = this.x - udaljenaTacka.x;
		int b = this.y - udaljenaTacka.y;
		double distance = Math.sqrt(a*a+b*b);
		return distance;
	}
	
	//metode pristupa - PUBLIC
	public int getX() {
		return x;
		//return this.x; --moze i ovako
	}

	public void setX(int x) {
		//property x klase Point = prosleđeno x metodi
		this.x=x;
		//x=x;--ne valja
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
