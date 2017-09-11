package learn.oki.lsn1;

public class VectorProcessor {
	
	public static AbsVector sum(AbsVector v, AbsVector w) throws Exception {
		if (w.getCoordinates().length != v.getCoordinates().length) {
			throw new Exception("dimentions not same");
		}
		float[] resultcorrdinates = new float[w.getCoordinates().length];
		
		for (int i=0; i < v.getCoordinates().length; i++) {
			resultcorrdinates[i] = v.getCoordinates()[i] + w.getCoordinates()[i]; 
		}
		return new Vector(resultcorrdinates);
	}
	
	public static AbsVector sub(AbsVector v, AbsVector w) throws Exception {
		if (w.getCoordinates().length != v.getCoordinates().length) {
			throw new Exception("dimentions not same");
		}
		float[] resultcorrdinates = new float[w.getCoordinates().length];
		
		for (int i=0; i < v.getCoordinates().length; i++) {
			resultcorrdinates[i] = v.getCoordinates()[i] - w.getCoordinates()[i]; 
		}
		return new Vector(resultcorrdinates);
	}
	
	public static AbsVector scalarMul(float val, AbsVector v) {
		float[] resultcorrdinates = new float[v.getCoordinates().length];
		
		int j = 0;
		for (float i : v.getCoordinates()) {
			resultcorrdinates[j++] = i * val; 
		}
		return new Vector(resultcorrdinates);
	}
	
	public static double dotProduct(AbsVector v, AbsVector w) {
		double finalValue = 0;
		for (int i=0; i < v.getCoordinates().length; i++) {
			finalValue += v.getCoordinates()[i] * w.getCoordinates()[i]; 
		}
		return finalValue;
	}
	
	public static double angleBetween(Vector v, Vector w, boolean isRad) {
		
		double outputRad = 0;
		/*double dotprodVal = dotProduct(v, w);
		if (v.getDimension() != 0 && w.getDimension() != 0) {
			outputRad = Math.acos(dotprodVal/(v.getDimension() * w.getDimension()));
		}*/
		outputRad = Math.acos(dotProduct(v.getUnitVector(), w.getUnitVector()));
		if (isRad) {
			return outputRad;
		} else {
			return Math.toDegrees(outputRad);
		}
		
		
	}
	
}
