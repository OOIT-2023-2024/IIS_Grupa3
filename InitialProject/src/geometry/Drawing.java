package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Probna aplikacija");
		
		JPanel drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}

	/**
	 * Create the panel.
	 */
	public Drawing() {

	}
	
	public void paint(Graphics g) {
		//Vezbe 8
		Point p81 = new Point(150,200);
		Rectangle r81 = new Rectangle(p81, 100, 120);
		Circle c81 = new Circle(p81, 50);
		
		p81.draw(g);
		g.setColor(Color.red);
		r81.draw(g);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p81);
		shapes.add(r81);
		shapes.add(c81);
		Iterator<Shape> itShape = shapes.iterator();
		//pomeriti elemente za 20pixela po x osi
		//i iscrtati elemente zutom bojom
		g.setColor(Color.yellow);
		while(itShape.hasNext()) {
			/*itShape.next().moveBy(20, 0);
			itShape.next().draw(g);*/
			Shape tempShape = itShape.next();
			tempShape.moveBy(20, 0);
			tempShape.draw(g);			
		}
		
		//obrada izuzetaka
		try {
			c81.setRadius(-50);
			System.out.println("Ostatak try bloka...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} finally {
			System.out.println("Ja se uvek izvrsavam");
		}
		System.out.println("Da li cu se izvrsiti?");
		
		
		//selektovanje
		Point p82 = new Point(400,400, true);
		p82.draw(g);
	}

}
