package Matala_5_QA.Matala_5_QA;

public class isIsolecense {
	public boolean TriangleIsisolecense(int a, int b, int c) {
		return ((a < b + c) && (b < a + c) && (c < a + b)) && ((a == b) || (b == c) || (a == c));
	}

}