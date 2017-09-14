package learn.oki.lsn1;

public class Vector extends AbsVector implements NonUnitVector {

	UnitVector unit;
	
	public UnitVector getUnitVector() {
		return unit;
	}
	
	public Vector(double[] coorrdinates) {
		super(coorrdinates);
		createUnitVector(this);
	}
	
	public void createUnitVector(Vector v) {
		unit = new UnitVector(this.normalize());
	}
	
	
}
