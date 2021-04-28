package ISA.Design;

public class CircleArea implements ShapesArea {
	
	private float radius;

	public float getRadius() {
		return radius;
	}

	public CircleArea() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateShapesArea() {
		float area = (float) (2 * 3.14 * this.radius);
		return area;
	}

	@Override
	public void setShapesAttribute(int m, int n) {
		this.radius = m;
	}


}
