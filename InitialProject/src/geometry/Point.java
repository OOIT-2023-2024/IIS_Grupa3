package geometry;

public class Point {
	//property klase point - PRIVATE
	//podrazumevane vrednosti: 0 0 false
	private int x;
	private int y;
	private boolean selected;
	
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
}
