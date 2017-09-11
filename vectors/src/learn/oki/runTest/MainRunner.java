package learn.oki.runTest;

import learn.oki.lsn1.Vector;
import learn.oki.lsn1.VectorProcessor;

public class MainRunner {

	public static void main(String[] args) {

		// Assignment 1
		try {
			Vector v = new Vector(new float[] {8.218f, -9.341f});
			Vector w = new Vector(new float[] {-1.129f, 2.111f});
			System.out.print("Sum : ");
			System.out.println(VectorProcessor.sum(v,w));

			v = new Vector(new float[] {7.119f, 8.215f});
			w = new Vector(new float[] {-8.223f, 0.878f});
			System.out.print("Subtraction : ");
			System.out.println(VectorProcessor.sub(v,w));

			v = new Vector(new float[] {1.671f, -1.012f, -0.318f});
			System.out.print("Multiply : ");
			System.out.println(VectorProcessor.scalarMul(7.41f, v));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Assignment 2
		try {
			System.out.println("Dimension : ");
			Vector v = new Vector(new float[] {-0.221f, 7.437f});
			System.out.println("	" + v.getDimension());

			v = new Vector(new float[] {8.813f, -1.331f, -6.247f});
			System.out.println("	" + v.getDimension());

			System.out.println("Unit : ");
			v = new Vector(new float[] {5.581f, -2.136f});
			System.out.println("	" + v.getUnitVector());

			v = new Vector(new float[] {1.996f, 3.108f, -4.554f});
			System.out.println("	" + v.getUnitVector());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Assignment 3
		try {
			System.out.println("Dot product : ");
			Vector v = new Vector(new float[] { 7.887f, 4.138f });
			Vector w = new Vector(new float[] { -8.802f, 6.776f });
			System.out.println("	" + "DOT 1 -> " + VectorProcessor.dotProduct(v, w));
			
			v = new Vector(new float[] { -5.955f, -4.904f, -1.874f });
			w = new Vector(new float[] { -4.496f, -8.755f, 7.103f });
			System.out.println("	" + "DOT 2 -> " + VectorProcessor.dotProduct(v, w));


			System.out.println("Angle between : ");
			v = new Vector(new float[] {3.183f, -7.627f });
			w = new Vector(new float[] {-2.668f, 5.319f });
			System.out.println("	" + "ANGL 1 -> " + VectorProcessor.angleBetween(v, w, true));
			
			v = new Vector(new float[] {7.35f, 0.221f, 5.188f});
			w = new Vector(new float[] {2.751f, 8.259f, 3.985f});
			System.out.println("	" + "ANGL 2 -> " + VectorProcessor.angleBetween(v, w, false));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
