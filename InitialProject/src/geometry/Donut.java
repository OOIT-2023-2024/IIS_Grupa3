package geometry;

public class Donut extends Circle {
	//ostali property se nasleđuju od Circle
	private int innerRadius;
	
	public Donut() {
		//u pozadini poziva super()
	}
	
	public Donut(int innerRadius) {
		//u pozadini poziva super()
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		//poziva konstruktor iz direktno nadređene klase
		//mora da bude prva naredba
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius,
			boolean selected) {
		this(center, radius, innerRadius);

		//ovako treba kad je selected private
		//demonstracija
		/*this.setSelected(selected);
		super.setCenter(center);
		setSelected(selected);*/
		
		//ovako moze kad je selected protected
		this.selected = selected;
		//super.selected = selected;	
	}

	//ostale get i set metode se nasleđuju
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public String toString() {
		//ako bismo pozvali toString() desila bi se rekurzija
		return super.toString() + ", innerRadius = "+innerRadius;
	}
	
}
