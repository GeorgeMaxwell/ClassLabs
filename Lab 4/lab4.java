import java.util.Random;

public class lab4 {
	public static void main(String[] args) {
		int[] randomArray = {1,2,3,4,5,6};
		/*Random random = new Random();
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = random.nextInt(50);
			// System.out.println(randomArray[i]);
		}*/
		PrefixAverages1(randomArray);
	}

	public static double[] PrefixAverages1(int[] arrayX) {
		double[] arrayAverage = new double[arrayX.length];
		for (int i = 0; i <= arrayX.length - 1; i++) {
			double s = arrayX[0];
			for (int j = 1; j <= arrayX.length - 1; j++) {
				if (j <= i) {
					s += arrayX[j];								
				}
			}
			arrayAverage[i] = s / (i + 1);
			System.out.println(arrayAverage[i]);
			
		}
		return arrayAverage;
	}

	public static double[] PrefixAverages2(int[] arrayX) {
		double s = 0;
		double[] arrayAverage = new double[arrayX.length];
		for (int i = 0; i <= arrayX.length-1; i++) {
			s += arrayX[i];
			arrayAverage[i] = s/(i+1);
			System.out.println(arrayAverage[i]);
		}
		return arrayAverage;
	}
}
