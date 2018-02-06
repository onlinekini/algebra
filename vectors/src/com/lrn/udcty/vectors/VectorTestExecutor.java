package learn.oki.runTest;

import learn.oki.lsn1.Vector;
import learn.oki.lsn1.VectorProcessor;

public class MainRunner {

	public static void main(String[] args) {

		
		// Assignment 1
		try {
			
			Vector v = null;
			Vector w = null;
			/*
			v = new Vector(new double[] { 8.218, -9.341 });
			w = new Vector(new double[] { -1.129, 2.111 });
			System.out.print("Sum : ");
			System.out.println(VectorProcessor.sum(v, w));

			v = new Vector(new double[] { 7.119, 8.215 });
			w = new Vector(new double[] { -8.223, 0.878 });
			System.out.print("Subtraction : ");
			System.out.println(VectorProcessor.sub(v, w));

			v = new Vector(new double[] { 1.671, -1.012, -0.318 });
			System.out.print("Multiply : ");
			System.out.println(VectorProcessor.scalarMul(7.41, v));

			// Assignment 2
			System.out.println("Dimension : ");
			v = new Vector(new double[] { -0.221, 7.437 });
			System.out.println("	" + v.getDimension());

			v = new Vector(new double[] { 8.813, -1.331, -6.247 });
			System.out.println("	" + v.getDimension());

			System.out.println("Unit : ");
			v = new Vector(new double[] { 5.581, -2.136 });
			System.out.println("	" + v.getUnitVector());

			v = new Vector(new double[] { 1.996, 3.108, -4.554 });
			System.out.println("	" + v.getUnitVector());

			// Assignment 3
			System.out.println("Dot product : ");
			v = new Vector(new double[] { 7.887, 4.138 });
			w = new Vector(new double[] { -8.802, 6.776 });
			System.out.println("	" + "DOT 1 -> " + VectorProcessor.dotProduct(v, w));

			v = new Vector(new double[] { -5.955, -4.904, -1.874 });
			w = new Vector(new double[] { -4.496, -8.755, 7.103 });
			System.out.println("	" + "DOT 2 -> " + VectorProcessor.dotProduct(v, w));

			System.out.println("Angle between : ");
			v = new Vector(new double[] { 3.183, -7.627 });
			w = new Vector(new double[] { -2.668, 5.319 });
			System.out.println("	" + "ANGL 1 -> " + VectorProcessor.angleBetween(v, w, true));

			v = new Vector(new double[] { 7.35, 0.221, 5.188 });
			w = new Vector(new double[] { 2.751, 8.259, 3.985 });
			System.out.println("	" + "ANGL 2 -> " + VectorProcessor.angleBetween(v, w, false));

			// Assignment 4
			System.out.println("IS Parallel OR Othogonal : ");
			v = new Vector(new double[] { -7.579, -7.880 });
			w = new Vector(new double[] { 22.737, 23.640 });
			System.out.println("	" + "is Parallel or Orthogonal -> " + VectorProcessor.isParallelOrOrthogonal(v, w));

			v = new Vector(new double[] { -2.029, -9.970, -4.172 });
			w = new Vector(new double[] { -9.231, -6.639, -7.245 });
			System.out.println("	" + "is Parallel or Orthogonal -> " + VectorProcessor.isParallelOrOrthogonal(v, w));

			v = new Vector(new double[] { -2.328, -7.284, -1.124 });
			w = new Vector(new double[] { -1.821, 1.072, -2.940 });
			System.out.println("	" + "is Parallel or Orthogonal -> " + VectorProcessor.isParallelOrOrthogonal(v, w));

			v = new Vector(new double[] { 2.118, 4.827 });
			w = new Vector(new double[] { 0, 0 });
			System.out.println("	" + "is Parallel or Orthogonal -> " + VectorProcessor.isParallelOrOrthogonal(v, w));

			// Assignment 5
			System.out.println("Projection of V on B");
			v = new Vector(new double[] {3.039, 1.879 });
			Vector b = new Vector(new double[] {0.825, 2.036 });
			System.out.println("	" + VectorProcessor.projection(v, b));

			System.out.println("Ortho of V to B");
			v = new Vector(new double[] {-9.88, -3.264, -8.159});
			b = new Vector(new double[] {-2.155, -9.353, -9.473});
			System.out.println("	" + VectorProcessor.getOrthogonalBetween(v, b));

			System.out.println("Ortho of V + Parallel of V");
			v = new Vector(new double[] {3.009,-6.172, 3.692, -2.51});
			b = new Vector(new double[] {6.404,-9.144, 2.759, 8.718});
			System.out.println(" 	" + VectorProcessor.projection(v, b));
			System.out.println("	" + VectorProcessor.getOrthogonalBetween(v, b));
			*/
			
			//Assignment 6
			System.out.println("V X W - Cross Product");
			v = new Vector(new double[] {8.462, 7.893, -8.187});
			w = new Vector(new double[] {6.984, -5.975, 4.778});
			System.out.println(" 	" + VectorProcessor.crossProduct(v, w));
			
			System.out.println("Area of Parallelogram spanned by v & w");
			v = new Vector(new double[] {-8.987, -9.838, 5.031});
			w = new Vector(new double[] {-4.268, -1.861, -8.866});
			System.out.println(" 	" + VectorProcessor.areaOfParallelogram(v, w));
			
			System.out.println("Area of Triangle spanned by v & w");
			v = new Vector(new double[] {1.5, 9.547, 3.691});			
			w = new Vector(new double[] {-6.007, 0.124, 5.772});			
			System.out.println(" 	" + (VectorProcessor.areaOfParallelogram(v, w))/2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
