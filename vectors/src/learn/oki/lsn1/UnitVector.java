package learn.oki.lsn1;

import java.util.Arrays;

public class UnitVector extends AbsVector {
	
	public UnitVector(float[] coorrdinates) {
		super(coorrdinates);
		//System.out.println(Arrays.toString(coorrdinates));
	}
	
	public String toString() {
		return "Unit Vector of coord: " + Arrays.toString(getCoordinates());
	}
	
}
