package learn.oki.lsn1;

import java.util.Arrays;

public abstract class AbsVector {
	private double dimension;
	private double[] coordinates;
	
	public AbsVector(double[] coorrdinates) {
		this.dimension = 0;
		this.coordinates = coorrdinates;
		double temp = 0.0;
		for (double val : coorrdinates) {
			temp += val*val;
		}
		dimension = Math.sqrt(temp);
	}
	
	public boolean equals(Vector w) {
		boolean retval = true;
		for (int i=0; i < this.getCoordinates().length; i++) {
			retval = retval & (this.getCoordinates()[i] == w.getCoordinates()[i]);
		}
		return retval;
	}
	
	public double[] normalize() {
		double[] resultcorrdinates = new double[getCoordinates().length];
		
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
	
	public double getDimension() {
		return dimension;
	}

	public double[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(double[] corrdinates) {
		this.coordinates = corrdinates;
	}
	
	
}
