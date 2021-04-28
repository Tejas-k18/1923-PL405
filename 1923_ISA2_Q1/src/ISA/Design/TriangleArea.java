package ISA.Design;

public class TriangleArea implements ShapesArea {

	private float base;
	public float getBase() {
		return base;
	}

	private float height;
	public float getHeight() {
		return height;
	}

	
	
	@Override
	public float calculateShapesArea() {
		float area = (float) (0.5 * this.base * this.height);
		return area;
	}

	@Override
	public void setShapesAttribute(int m, int n) {
		this.base = m;
		this.height = n;

	}

}
