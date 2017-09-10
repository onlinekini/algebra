package learn.oki.runTest;

import learn.oki.lsn1.Vector;

public class MainRunner {

	
	public static void main(String[] args) {
		
		// Assignment 1
		try {
			Vector v = new Vector(new float[]{8.218f,-9.341f});
			System.out.print("Sum : ");
			System.out.println(v.sum(new Vector(new float[]{-1.129f,2.111f})));

			v = new Vector(new float[]{7.119f,8.215f});
			System.out.print("Subtraction : ");
			System.out.println(v.sub(new Vector(new float[]{-8.223f,0.878f})));

			v = new Vector(new float[]{1.671f,-1.012f, -0.318f});
			System.out.print("Multiply : ");
			System.out.println(v.scalaMul(7.41f));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// Assignment 2
		try {
			System.out.println("Dimension : ");
			Vector v = new Vector(new float[]{-0.221f,7.437f});
			System.out.println("	" + v.getDimension());

			v = new Vector(new float[]{8.813f, -1.331f, -6.247f});
			System.out.println("	" + v.getDimension());

			System.out.println("Unit : ");
			v = new Vector(new float[]{5.581f,-2.136f});
			System.out.println("	" + v.getUnitVector());
			
			v = new Vector(new float[]{1.996f, 3.108f, -4.554f});
			System.out.println("	" + v.getUnitVector());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
