package pkgPS2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test // test the integer 3 for even/odd/prime; compare it to integer 4 
	public void test1() {
		
		int testInteger1 = 3; 
		int testInteger2 = 4;
		
		MyInteger integer1 = new MyInteger(testInteger1);
		MyInteger integer2 = new MyInteger(testInteger2);

		boolean expectedIsEven = false;
		boolean expectedIsOdd = true;
		boolean expectedIsPrime = true;

		assertEquals(expectedIsEven, integer1.isEven());
		assertEquals(expectedIsOdd, integer1.isOdd());
		assertEquals(expectedIsPrime, integer1.isPrime());
				
		assertEquals(expectedIsEven, MyInteger.isEven(testInteger1));
		assertEquals(expectedIsOdd, MyInteger.isOdd(testInteger1));
		assertEquals(expectedIsPrime, MyInteger.isPrime(testInteger1));

		assertEquals(expectedIsEven, MyInteger.isEven(integer1));
		assertEquals(expectedIsOdd, MyInteger.isOdd(integer1));
		assertEquals(expectedIsPrime, MyInteger.isPrime(integer1));
		
		assertEquals(false, integer1.equals(testInteger2));
		assertEquals(false, integer1.equals(integer2));
		
	}

	@Test // test the integer 2 for even/odd/prime; compare it to integer 2 
	public void test2() {
		
		int testInteger1 = 2; 
		int testInteger2 = 2;
		
		MyInteger integer1 = new MyInteger(testInteger1);
		MyInteger integer2 = new MyInteger(testInteger2);

		boolean expectedIsEven = true;
		boolean expectedIsOdd = false;
		boolean expectedIsPrime = true;

		assertEquals(expectedIsEven, integer1.isEven());
		assertEquals(expectedIsOdd, integer1.isOdd());
		assertEquals(expectedIsPrime, integer1.isPrime());
				
		assertEquals(expectedIsEven, MyInteger.isEven(testInteger1));
		assertEquals(expectedIsOdd, MyInteger.isOdd(testInteger1));
		assertEquals(expectedIsPrime, MyInteger.isPrime(testInteger1));

		assertEquals(expectedIsEven, MyInteger.isEven(integer1));
		assertEquals(expectedIsOdd, MyInteger.isOdd(integer1));
		assertEquals(expectedIsPrime, MyInteger.isPrime(integer1));
		
		assertEquals(true, integer1.equals(testInteger2));
		assertEquals(true, integer1.equals(testInteger2));
		assertEquals(true, integer1.equals(integer2));
		assertEquals(true, integer1.equals(integer1.getiValue()));
		
	}

	@Test // test the integer 15 for even/odd/prime; compare it to integer 295 
	public void test3() {
		
		int testInteger1 = 15; 
		int testInteger2 = 295;
		
		MyInteger integer1 = new MyInteger(testInteger1);
		MyInteger integer2 = new MyInteger(testInteger2);

		boolean expectedIsEven = false;
		boolean expectedIsOdd = true;
		boolean expectedIsPrime = false;

		assertEquals(expectedIsEven, integer1.isEven());
		assertEquals(expectedIsOdd, integer1.isOdd());
		assertEquals(expectedIsPrime, integer1.isPrime());
				
		assertEquals(expectedIsEven, MyInteger.isEven(testInteger1));
		assertEquals(expectedIsOdd, MyInteger.isOdd(testInteger1));
		assertEquals(expectedIsPrime, MyInteger.isPrime(testInteger1));

		assertEquals(expectedIsEven, MyInteger.isEven(integer1));
		assertEquals(expectedIsOdd, MyInteger.isOdd(integer1));
		assertEquals(expectedIsPrime, MyInteger.isPrime(integer1));
		
		assertEquals(false, integer1.equals(testInteger2));
		assertEquals(false, integer1.equals(integer2));
		
	}


	@Test // test the integer 4 for even/odd/prime; compare it to integer 4 
	public void test4() {
		
		int testInteger1 = 4; 
		int testInteger2 = 4;
		
		MyInteger integer1 = new MyInteger(testInteger1);
		MyInteger integer2 = new MyInteger(testInteger2);

		boolean expectedIsEven = true;
		boolean expectedIsOdd = false;
		boolean expectedIsPrime = false;

		assertEquals(expectedIsEven, integer1.isEven());
		assertEquals(expectedIsOdd, integer1.isOdd());
		assertEquals(expectedIsPrime, integer1.isPrime());
				
		assertEquals(expectedIsEven, MyInteger.isEven(testInteger1));
		assertEquals(expectedIsOdd, MyInteger.isOdd(testInteger1));
		assertEquals(expectedIsPrime, MyInteger.isPrime(testInteger1));

		assertEquals(expectedIsEven, MyInteger.isEven(integer1));
		assertEquals(expectedIsOdd, MyInteger.isOdd(integer1));
		assertEquals(expectedIsPrime, MyInteger.isPrime(integer1));
		
		assertEquals(true, integer1.equals(testInteger2));
		assertEquals(true, integer1.equals(integer2));
		
	}

	
	



}