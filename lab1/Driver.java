package lab1;

public class Driver{
	 public static void main(String[] args) {
	        Rectangle rec = new Rectangle();
	        rec.setLength(10);
	        rec.setWidth(5);
	        System.out.println("Rectangle area: " + rec.getArea());

	        Circle cir = new Circle();
	        cir.setRadius(12);
	        System.out.println("Circle area: " + cir.getArea());
	        
	        Ellispe e1 = new Ellispe();
	        e1.setLength(12.5);
	        e1.setWidth(34);
	        System.out.println("Ellipse 1 area: " + e1.getArea());
	    }
	}


