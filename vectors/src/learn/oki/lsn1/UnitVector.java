package learn.oki.lsn1;

import java.util.Arrays;

public class UnitVector {
	
	private float[] corrdinates;
	
	public UnitVector(Vector v) {
		float[] resultcorrdinates = new float[v.getCorrdinates().length];
		
		for (int i=0; i < v.getCorrdinates().length; i++) {
			resultcorrdinates[i] = v.getCorrdinates()[i] / v.getDimension(); 
		}
		this.corrdinates = resultcorrdinates;
	}
	
	public String toString() {
		return "Unit Vector of coord: " + Arrays.toString(this.corrdinates);
	}
	
}
