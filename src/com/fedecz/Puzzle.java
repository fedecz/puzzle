package com.fedecz;

import java.math.BigInteger;

public class Puzzle {

	public BigInteger getSum(BigInteger n, BigInteger c) {
		BigInteger sum = BigInteger.ZERO;
		for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i=i.add(BigInteger.ONE)) {
			sum = sum.add(calculateProduct(i, i.subtract(BigInteger.ONE), c));
		}
		return sum;
	}

	private BigInteger calculateProduct(BigInteger i, BigInteger j, BigInteger c) {
		if (j.compareTo(BigInteger.ZERO) < 0) return BigInteger.ZERO;
		if (j.compareTo(BigInteger.ZERO) == 0) return BigInteger.ONE;
		if ((i.subtract(j).compareTo(c)) <= 0){
			return j.add(BigInteger.ONE).multiply(calculateProduct(i, j.subtract(BigInteger.ONE), c));
		}else
			return BigInteger.ONE;
	}
}
