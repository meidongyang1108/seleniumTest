package test.demo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDemo01 {

	@BeforeClass
	public void beforeTestCase1() {
		System.out.println("@BeforeClass注解");
	}
	@Before
	public void beforeMethodTestCase1() {
		System.out.println("@Before注解");
	}
	@Test
	public void testCase1() {
		System.out.println("@Test注解，case1");
	}
	@Test
	public void testCase2() {
		System.out.println("@Test注解，case2");
	}
}
