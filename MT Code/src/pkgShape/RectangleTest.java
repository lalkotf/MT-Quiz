package pkgShape;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("unused")
class RectangleTest {

	@Test
	public void constructorTest() {
		Rectangle r1 = new Rectangle(10,20);
		assertTrue(r1 instanceof Rectangle);
		
	}
	
	@Test
	public void setterTest() {
		Rectangle r1 = new Rectangle(10,20);
		r1.setiLength(5);
		r1.setiWidth(15);
		assertTrue(r1.getiWidth()==15 && r1.getiLength()==5);
	}
	
	@Test
	public void getterTest() {
		Rectangle r1 = new Rectangle(10,20);
		assertTrue((r1.getiWidth()==10) && (r1.getiLength()==20));
		
	}
	
	@Test
	public void perimeterTest() throws Exception {
		Rectangle r1 = new Rectangle(2,4);
		assertTrue(r1.perimeter() == 12);
	}
	
	@Test
	public void areaTest(){
		Rectangle r1 = new Rectangle (10,20);
		double area = 200;
		assertTrue(area == r1.area());
	}
	
	@Test
	public void compareToTest() {
		Rectangle r1 = new Rectangle(2,2);
		Rectangle r2 = new Rectangle(4,6);
		ArrayList<Rectangle> al = new ArrayList<Rectangle>();
		al.add(r2);
		al.add(r1);
		Rectangle[] rect2 = {r1,r2};
		Collections.sort(al);
		assertArrayEquals(rect2,al.toArray());
		
	}

}
