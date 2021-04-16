package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNum {

	@Test
	public void test() {
		jUnitTestingFunction junit = new jUnitTestingFunction();
		int result = junit.addNumbers(100,200);
		assertEquals (300, result);
	}

}
