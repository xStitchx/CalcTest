package calcer;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcerTest {
	
	@Test
	public void testAdd1() {
		assertEquals(0,new Calcer(0,0).add());
	}
	@Test
	public void testAdd2() {
		assertEquals(4,new Calcer(2,2).add());
	}
	@Test
	public void testAdd3() {
		assertEquals(0,new Calcer(-5,5).add());
	}
	@Test
	public void testAdd4() {
		assertEquals(44,new Calcer(22,22).add());
	}
	@Test
	public void testAdd5() {
		assertEquals(1001,new Calcer(1000,1).add());
	}
	
	@Test
	public void testSub1() {
		assertEquals(8,new Calcer(9,1).subtract());
	}
	@Test
	public void testMult1() {
		assertEquals(49,new Calcer(7,7).mult());
	}	
	@Test
	public void testDivide1() {
		assertEquals(4,new Calcer(8,2).divide());
	}
	@Test
	public void testPower1() {
		assertEquals(8,new Calcer(2,3).power());
	}
	@Test
	public void testMin1() {
		assertEquals(3,new Calcer(3,333).add());
	}
	@Test
	public void testMax1() {
		assertEquals(333,new Calcer(3,333).max());
	}
	@Test
	public void testDistance() {
		assertEquals(18,new Calcer(12,14).distance());
	}
}
