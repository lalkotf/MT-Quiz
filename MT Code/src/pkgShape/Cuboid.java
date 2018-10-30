package pkgShape;

public class Cuboid extends Rectangle {
	private int iDepth; 
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume(){
		return super.getiLength() * super.getiWidth() * iDepth;
		
	}
	@Override
	public double area() 
	{
	    return 2 * ((super.area()) + (super.getiWidth() * this.iDepth) + (super.getiLength() * this.iDepth));
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}




	
}
