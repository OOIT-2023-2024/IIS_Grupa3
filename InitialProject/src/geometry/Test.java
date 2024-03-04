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
	}

}
