package learn.oki.lsn1;

public class VectorProcessor {
	
	/**
	 * Computes the sum of two vectors- Vector addition
	 * 
	 * @param v
	 * @param w
	 * @return
	 * @throws Exception
	 */
	public static AbsVector sum(AbsVector v, AbsVector w) throws Exception {
		if (w.getCoordinates().length != v.getCoordinates().length) {
			throw new Exception("dimentions not same");
		}
		double[] resultcorrdinates = new double[w.getCoordinates().length];
		
		for (int i=0; i < v.getCoordinates().length; i++) {
			resultcorrdinates[i] = v.getCoordinates()[i] + w.getCoordinates()[i]; 
		}
		return new Vector(resultcorrdinates);
	}
	
	/**
	 * Computes the difference between two vectors- Vector subtraction
	 * 
	 * @param v
	 * @param w
	 * @return
	 * @throws Exception
	 */
	public static AbsVector sub(AbsVector v, AbsVector w) throws Exception {
		if (w.getCoordinates().length != v.getCoordinates().length) {
			throw new Exception("dimentions not same");
		}
		double[] resultcorrdinates = new double[w.getCoordinates().length];
		
		for (int i=0; i < v.getCoordinates().length; i++) {
			resultcorrdinates[i] = v.getCoordinates()[i] - w.getCoordinates()[i]; 
		}
		return new Vector(resultcorrdinates);
	}
	
	/**
	 * Scalar multiplication 
	 * 
	 * @param val
	 * @param v
	 * @return
	 */
	public static AbsVector scalarMul(double val, AbsVector v) {
		double[] resultcorrdinates = new double[v.getCoordinates().length];
		
		int j = 0;
		for (double i : v.getCoordinates()) {
			resultcorrdinates[j++] = i * val; 
		}
		return new Vector(resultcorrdinates);
	}
	
	/**
	 * Dot Product between two vectors
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	public static double dotProduct(AbsVector v, AbsVector w) {
		double finalValue = 0;
		for (int i = 0; i < v.getCoordinates().length; i++) {
			finalValue += v.getCoordinates()[i] * w.getCoordinates()[i]; 
		}
		//System.out.println("DOT : " + finalValue);
		return finalValue;
	}
	
	/**
	 * Angle between two vectors - two options
	 * 
	 * @param v
	 * @param w
	 * @param isRad
	 * @return
	 */
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
	
	
	/**
	 * Check if the two vectors are parallel 
	 *  
	 * @param v
	 * @param w
	 * @return
	 */
	public static boolean isParallel(AbsVector v, AbsVector w) {
		double divVal = 0;
		double tempDivVal = 0;
		boolean isParallel = true;
		for (int i=0; i < v.getCoordinates().length; i++) {
			tempDivVal = v.getCoordinates()[i] / w.getCoordinates()[i];
			if (i == 0) {
				divVal = tempDivVal;
			} else {
				if ((int)divVal*1000 != (int)tempDivVal*1000) {
					isParallel = false;
					break;
				}
			}
		}
		return isParallel;
	}
	
	
	/**
	 * Check if the vectors are orthogonal to each other
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	public static boolean isOrthogonal(AbsVector v, AbsVector w) {
		if ((int) dotProduct(v, w) * 100 < 1e-10) {
			//System.out.println(dotProduct(v, w));
			return true;
		}
		return false;
	}
	
	
	/**
	 * Check if the vectors are parallel or orthogonal 
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	public static String isParallelOrOrthogonal(AbsVector v, AbsVector w) {
		boolean isParallel = false;
		boolean isOrthogonal = false;
		isParallel = isParallel(v, w);
		isOrthogonal = isOrthogonal(v, w);
		
		if (isOrthogonal && isParallel) {
			return "PARALLEL & ORTHOGONAL";
		} else if (isOrthogonal) {
			return "ORTHOGONAL";
		} else if (isParallel) {
			return "PARALLEL";
		} else {
			return "NONE";
		}
		
	}
	
	/**
	 * Get the projection of vector V on the base vector B
	 * 
	 * @param v
	 * @param b
	 * @return
	 */
	public static AbsVector projection(AbsVector v, NonUnitVector b) {
		return scalarMul(dotProduct(v, b.getUnitVector()), b.getUnitVector());
	}
	
	
	/**
	 * Get the Vector perpendicular / orthogonal to B wrt - V.
	 * 
	 * @param v
	 * @param b
	 * @return
	 */
	public static AbsVector getOrthogonalBetween(AbsVector v, NonUnitVector b) {
		try {
			return sub(v, projection(v, b));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Vector(new double[]{0,0,0});
	}
	
	
	/**
	 * Get the cross product between V and W. 
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	public static AbsVector crossProduct(AbsVector v, AbsVector w) {
		double[] resultcorrdinates = new double[v.getCoordinates().length];
		double interim1 = 0.0;
		double interim2 = 0.0;
		for (int i = 0; i < v.getCoordinates().length; i++ ) {
			interim1 = w.getCoordinates()[(i + 1) % v.getCoordinates().length] * v.getCoordinates()[(i + 2) % v.getCoordinates().length];
			interim2 = v.getCoordinates()[(i + 1) % v.getCoordinates().length] * w.getCoordinates()[(i + 2) % v.getCoordinates().length];
			resultcorrdinates[i] = interim1 - interim2;
		}
		return new Vector(resultcorrdinates);		
	}
	
	
	/**
	 * Get the cross product between V and W. 
	 * 
	 * @param v
	 * @param w
	 * @return
	 *//*
	public static double areaOfParallelogram(AbsVector v, AbsVector w) {
		AbsVector resultantVector = crossProduct(v, w); 
		
	}*/
	
	
	
	
}
