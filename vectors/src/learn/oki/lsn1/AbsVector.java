package learn.oki.lsn1;

import java.util.Arrays;

public abstract class AbsVector {
	private float dimension;
	private float[] coordinates;
	
	public AbsVector(float[] coorrdinates) {
		this.dimension = 0;
		this.coordinates = coorrdinates;
		double temp = 0.0;
		for (float val : coorrdinates) {
			temp += val*val;
		}
		dimension = (float)Math.sqrt(temp);
	}
	
	public boolean equals(Vector w) {
		boolean retval = true;
		for (int i=0; i < this.getCoordinates().length; i++) {
			retval = retval & (this.getCoordinates()[i] == w.getCoordinates()[i]);
		}
		return retval;
	}
	
	public float[] normalize() {
		float[] resultcorrdinates = new float[getCoordinates().length];
		
		for (int i=0; i < getCoordinates().length; i++) {
			resultcorrdinates[i] = getCoordinates()[i] / getDimension(); 
		}
		//System.out.println(Arrays.toString(resultcorrdinates));
		return resultcorrdinates;
	}
	
	public String toString() {
		return "Vector of dimension: " + this.dimension +
				" coord: " + Arrays.toString(this.getCoordinates()) ;
	}
	
	public float getDimension() {
		return dimension;
	}

	public float[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(float[] corrdinates) {
		this.coordinates = corrdinates;
	}
	
	
}
