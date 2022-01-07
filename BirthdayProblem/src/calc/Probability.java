package calc;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Probability {
	
	public int fac(int x) {
		int result=x;
		for (int i=x-1;i>0;i--) {
			result=result*i;
		}
		return result;
	}
	
	public double prob(int size) {
		BigInteger counter = BigInteger.valueOf(365);
		for (int i=364;i>365-size;i--) {
			counter= counter.multiply(BigInteger.valueOf(i));
		}
		BigInteger denominator = BigInteger.valueOf(365);
		for (int i=size-1;i>0;i--) {
			denominator=denominator.multiply(BigInteger.valueOf(365));
		}
		BigDecimal result = new BigDecimal(counter);
		result=result.divide(new BigDecimal(denominator),5, 1);
		return 1-result.doubleValue();
		
	}
	
	public double prob2(int n, int k) {
		int counter = n;
		for (int i=n-1;i>n-k;i--) {
			counter=counter*i;
		}
		int denominator=n;
		for (int i=k-1;i>0;i--) {
			denominator=denominator*n;
		}
		return((double)counter/(double)denominator);
	}

}
