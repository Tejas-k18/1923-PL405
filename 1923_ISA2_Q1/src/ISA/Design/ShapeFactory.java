package ISA.Design;


public class ShapeFactory {
	  //use getShape method to get object of type shape 
	   public ShapesArea getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RectangleArea();
	         
	      } else if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new CircleArea();
	         
	      } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
		         return new TriangleArea();
		  }
		      
		  return null;
		  }
}
