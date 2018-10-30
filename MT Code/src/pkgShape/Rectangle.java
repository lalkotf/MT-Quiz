package pkgShape;

public class Rectangle extends Shape implements Comparable<Rectangle>{
	
	private int iWidth, iLength; 

	public Rectangle(int iWidth, int iLength) 
	{
	    this.iWidth = iWidth;
	    this.iLength = iLength;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	@Override
	public double area() 
	{
	    return iLength * iWidth;
	}
	
    @Override
	public double perimeter() 
	{
	    return 2 * (iWidth + iLength);
	}
	
	@Override
	public int compareTo(Rectangle object) {
		if (this.area() > object.area()) {
			return 1;
		}
		else if (this .area() < object.area()) {
			return -1;
	}
		return 0;
	
	}   
}
	
