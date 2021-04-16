package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddString {

	@Test
	public void test() {
		jUnitTestingFunction junitstring = new jUnitTestingFunction();
		String result = junitstring.addString("hello","world");
		assertEquals ("helloworld", result);
	}

}
