package learn.oki.lsn1;

public class VectorProcessor {
	
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
	
	public static AbsVector scalarMul(double val, AbsVector v) {
		double[] resultcorrdinates = new double[v.getCoordinates().length];
		
		int j = 0;
		for (double i : v.getCoordinates()) {
			resultcorrdinates[j++] = i * val; 
		}
		return new Vector(resultcorrdinates);
	}
	
	public static double dotProduct(AbsVector v, AbsVector w) {
		double finalValue = 0;
		for (int i = 0; i < v.getCoordinates().length; i++) {
			finalValue += v.getCoordinates()[i] * w.getCoordinates()[i]; 
		}
		//System.out.println("DOT : " + finalValue);
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
	
	
	public static boolean isOrthogonal(AbsVector v, AbsVector w) {
		if ((int) dotProduct(v, w) * 100 < 1e-10) {
			//System.out.println(dotProduct(v, w));
			return true;
		}
		return false;
	}
	
	
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
	
	
	public static AbsVector projection(AbsVector v, NonUnitVector b) {
		return scalarMul(dotProduct(v, b.getUnitVector()), b.getUnitVector());
	}
	
	public static AbsVector getOrthogonalBetween(AbsVector v, NonUnitVector b) {
		try {
			return sub(v, projection(v, b));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Vector(new double[]{0,0,0});
	}
	
}
