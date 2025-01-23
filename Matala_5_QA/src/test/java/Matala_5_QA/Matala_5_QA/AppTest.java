package Matala_5_QA.Matala_5_QA;

import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.junit.Test;

public class AppTest {
	
	isIsolecense isolecense = Mockito.mock(isIsolecense.class);
	Multiplier multiplier = Mockito.mock(Multiplier.class);
	PowerCalculator power_calc = new PowerCalculator(multiplier);
	TriangleClassifier triangle = new TriangleClassifier(isolecense);

    @Test
    public void unitTestTriangle() {
    	Mockito.when(isolecense.TriangleIsisolecense(5, 6, 6)).thenReturn(true);
    	int a = 5, b = 6, c = 6;
    	String expected = TriangleClassifier.Triangle_Types.Isolecense.toString();
   	    String answer = triangle.IsolecenseTest(a, b, c);
    	assertEquals(expected, answer);
    }
    
    @Test
    public void powerTest() {
    	Mockito.when(multiplier.multiply(4.0, 2.0)).thenReturn(16.0);
    	double a = 4.0 , b = 2.0;
    	double expected = 16.0;
    	double result = power_calc.power(a, b);
    	assertEquals(expected, result, 0);
    }
}
