package geometry;

public class Point {
	//property klase point - PRIVATE
	//podrazumevane vrednosti: 0 0 false
	private int x;
	private int y;
	private boolean selected;	
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//dozvoljava ali nam je nepotrebno
	public Point(int x) {
		this.x = x;
	}
	
	/*ne dozvoljava
	 * public Point(int xKoordinata, int y) {
		this.x = xKoordinata;
		this.y = y;
	}*/
	
	/*tip parametara se razlikuje pa moze*/
	//moze ali nije ispravno 
	/*public Point(int xKoordinata, String y) {
		//
	}
	public Point(String y, int xKoordinata) {
		//
	}*/
	
	public Point(int x, int y, boolean selected) {
		/*this.x = x;
		this.y = y;*/
		//nasledjivanje konstruktora
		this(x,y);
		this.selected = selected;
	}

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
