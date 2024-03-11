package geometry;

public class Test {

	public static void main(String[] args) {
		//inicijalizuje property klase Point na podrazumevane
		//prva tacka ima 0 0 false
		Point prvaTackaTest=new Point();
		Point drugaTacka=new Point();
		//System.out.println(x); --ne valja
		//System.out.println(prvaTacka.x);--ne valja
		//System.out.println(getX());--ne valja
		//System.out.println(Point.getX());--ne valja
		System.out.println(prvaTackaTest.getX());
		prvaTackaTest.setX(50);
		System.out.println(prvaTackaTest.getX());
		System.out.println(drugaTacka.getX());
		drugaTacka.setX(60);
		System.out.println(drugaTacka.getX());
		
		//Trece vezbe
		//distance();--ne valja
		//nije staticka pa ne moze ovako
		//Point.distance();
		//metoda instance - metoda koja se poziva nad objektom
		//objekat klase Point jer je distance osobina/ponasanje Point-a
		System.out.println(prvaTackaTest.distance(drugaTacka));
		
		//Zadaci
		//1.
		Point point1 = new Point();
		Point point2 = new Point();
		Line  line1= new Line();
		
		point1.setX(20);
		point1.setY(40);
		point2.setX(50);
		point2.setY(60);
		
		//3.
		point1.setX(point2.getY());
		
		//4.
		//start point je u ovom trenutku null pa ni ne moye da se pozove
		//getX metoda za null
		//System.out.println(line1.getStartPoint().getX());
		
		//prvo moramo inicijalizovati pocetnu i krajnju tacku linije
		
		//5.
		line1.setStartPoint(point1);
		line1.setEndPoint(point2);
		System.out.println(line1.getStartPoint().getX());
		System.out.println(line1.getStartPoint().getY());
		System.out.println(line1.getEndPoint().getX());
		System.out.println(line1.getEndPoint().getY());
		
		//6.
		line1.getEndPoint().setY(23);
		System.out.println(line1.getEndPoint().getY());
		System.out.println(point2.getY());
		
		//7.
		line1.getStartPoint().setX(line1.getEndPoint().getY());
		
		//8. vec radjeno slicno
		
		//9.
		line1.getEndPoint().setX((int)(line1.length() 
				- (line1.getStartPoint().getX() +
						line1.getStartPoint().getY())));
		

		
		
		
		
		
		
	}

}
