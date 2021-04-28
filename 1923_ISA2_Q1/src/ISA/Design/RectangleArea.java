package ISA.Design;

public class RectangleArea implements ShapesArea {
	private float length;
	public float getLength() {
		return length;
	}

	private float breadth;
	public float getBreadth() {
		return breadth;
	}


	@Override
	public float calculateShapesArea() {
		float area = this.length * this.breadth;
		return area;
	}

	@Override
	public void setShapesAttribute(int m, int n) {
		this.length = m;
		this.breadth = n;

	}

}
