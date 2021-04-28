package ISA.Design;


public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		ShapesArea rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.setShapesAttribute(12,20);
		System.out.println("Area of Rectangle = "+rectangle.calculateShapesArea());
		
		ShapesArea circle = shapeFactory.getShape("CIRCLE");
		circle.setShapesAttribute(20, 12);
		System.out.println("Area of Circle = "+circle.calculateShapesArea());
		
		ShapesArea triangle = shapeFactory.getShape("TRIANGLE");
		triangle.setShapesAttribute(10, 20);
		System.out.println("Area of Triangle = "+triangle.calculateShapesArea());


	}

}
