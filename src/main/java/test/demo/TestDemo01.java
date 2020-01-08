package test.demo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDemo01 {

	@BeforeClass
	public void beforeTestCase1() {
		System.out.println("@BeforeClassע��");
	}
	@Before
	public void beforeMethodTestCase1() {
		System.out.println("@Beforeע��");
	}
	@Test
	public void testCase1() {
		System.out.println("@Testע�⣬case1");
	}
	@Test
	public void testCase2() {
		System.out.println("@Testע�⣬case2");
	}
}
