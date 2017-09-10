package learn.oki.lsn1;

import java.util.Arrays;

public class Vector {
	
	private float dimension;
	private float[] corrdinates;
	private UnitVector unitVector;
	
	public Vector(float[] coorrdinates) {
		this.dimension = 0;
		this.corrdinates = coorrdinates;
		double temp = 0.0;
		for (float val : coorrdinates) {
			temp += val*val;
		}
		dimension = (float)Math.sqrt(temp);
		setUnitVector(new UnitVector(this));
	}
	
	public boolean equals(Vector v) {
		boolean retval = true;
		for (int i=0; i < this.corrdinates.length; i++) {
			retval = retval & (this.corrdinates[i] == v.corrdinates[i]);
		}
		return retval;
	}
	
	public String toString() {
		return "Vector of dimension: " + this.dimension +
				" coord: " + Arrays.toString(this.corrdinates) ;
	}
	
	public Vector sum(Vector v) throws Exception {
		if (v.corrdinates.length != this.corrdinates.length) {
			throw new Exception("dimentions not same");
		}
		float[] resultcorrdinates = new float[v.corrdinates.length];
		
		for (int i=0; i < this.corrdinates.length; i++) {
			resultcorrdinates[i] = this.corrdinates[i] + v.corrdinates[i]; 
		}
		return new Vector(resultcorrdinates);
	}
	
	public Vector sub(Vector v) throws Exception {
		if (v.corrdinates.length != this.corrdinates.length) {
			throw new Exception("dimentions not same");
		}
		float[] resultcorrdinates = new float[v.corrdinates.length];
		
		for (int i=0; i < this.corrdinates.length; i++) {
			resultcorrdinates[i] = this.corrdinates[i] - v.corrdinates[i]; 
		}
		return new Vector(resultcorrdinates);
	}
	
	public Vector scalaMul(float val) {
		float[] resultcorrdinates = new float[this.corrdinates.length];
		
		int j = 0;
		for (float i : this.corrdinates) {
			resultcorrdinates[j++] = i * val; 
		}
		return new Vector(resultcorrdinates);
	}
	
	
	public float getDimension() {
		return dimension;
	}

	public float[] getCorrdinates() {
		return corrdinates;
	}

	public void setCorrdinates(float[] corrdinates) {
		this.corrdinates = corrdinates;
	}

	public UnitVector getUnitVector() {
		return unitVector;
	}

	public void setUnitVector(UnitVector unitVector) {
		this.unitVector = unitVector;
	}

}
