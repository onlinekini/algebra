package com.lrn.udcty.vectors;

import java.util.Arrays;

public class UnitVector extends AbsVector {
	
	public UnitVector(double[] coorrdinates) {
		super(coorrdinates);
		//System.out.println(Arrays.toString(coorrdinates));
	}
	
	public String toString() {
		return "Unit Vector of coord: " + Arrays.toString(getCoordinates());
	}
	
}
