package Matala_5_QA.Matala_5_QA;


public class TriangleClassifier {
	
	public enum Triangle_Types{
		Isolecense,
		NotIsolecense,
		Equilateral,
		Scalane,
		NotTriangle
	}
	
	
	private isIsolecense isisolecense;
	
	public TriangleClassifier(isIsolecense isisolecense) {
		this.isisolecense = isisolecense;
	}
	
	public String IsolecenseTest(int a, int b, int c) {	
		if(isisolecense.TriangleIsisolecense(a, b, c)) {
			return Triangle_Types.Isolecense.toString();
		}
		else
			return Triangle_Types.NotIsolecense.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
}
