package com.fedecz.test;


import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fedecz.Puzzle;

public class PuzzleTest {

	Puzzle p = new Puzzle();
		
	@Test
	public void testSimpleCase(){
		BigInteger n = new BigInteger("5");
		BigInteger c = new BigInteger("2");
		BigInteger sum = p.getSum(n, c);
		print(n, c,sum);
		Assert.assertEquals(new BigInteger("21"), sum);
	}

	private void print(BigInteger n, BigInteger c,BigInteger sum) {
		System.out.println(String.format("Result for N=%s C=%s = %s", n.toString(),c.toString(),sum.toString()));
	}

	@Test
	public void withN_OneItShouldReturnZero(){
		BigInteger n = BigInteger.ONE;
		BigInteger c = new BigInteger("2");
		BigInteger sum = p.getSum(n, c);
		print(n, c,sum);
		Assert.assertEquals(BigInteger.ZERO, sum);
	}
	
	@Test
	public void withN_TwoItShouldReturnOne(){
		BigInteger n = new BigInteger("2");
		BigInteger c = new BigInteger("2");
		BigInteger sum = p.getSum(n, c);
		print(n, c,sum);
		Assert.assertEquals(BigInteger.ONE, sum);
	}
	
	@Test
	public void withTenAndThreeShouldReturn1263(){
		BigInteger n = BigInteger.TEN;
		BigInteger c = new BigInteger("3");
		BigInteger sum = p.getSum(n, c);
		print(n, c,sum);
		Assert.assertEquals(new BigInteger("1263"), sum);
	}
	
	@Test
	public void question1(){
		BigInteger n = new BigInteger("100");
		BigInteger c = new BigInteger("10");
		BigInteger sum = p.getSum(n, c);
		print(n, c,sum);
		Assert.assertEquals(new BigInteger("513946235090696089113"), sum);
	}
	
	//@Test
	public void question2(){
		BigInteger n = new BigInteger("1000000");
		BigInteger c = new BigInteger("200");
		BigInteger sum = p.getSum(n, c);
		System.out.print("First ten digits only: ");
		String substring = sum.toString().substring(0, 10);
		System.out.println(String.format("Result for N=%s C=%s = %s", n.toString(),c.toString(),substring));
		Assert.assertTrue("4876116127".equals(substring));
	}
}
