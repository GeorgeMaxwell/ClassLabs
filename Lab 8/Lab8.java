import java.util.ArrayList;

public class Lab8 {
	public static void main(String[] args) {
		ArrayList<Double> weights = new ArrayList<>();
		
		String path = System.getProperty("user.dir") + "\\src\\1000 Primes.txt";
		ScalesSolution s = new ScalesSolution(1000);
		int counter =0;
		weights.addAll(CS2004.ReadNumberFile( path));
		while (s.ScalesFitness(weights)> 1000) {
			s.println();
			System.out.println(s.ScalesFitness(weights));
			s= new ScalesSolution(1000);
			counter ++;
		}
		
		s.println();
		//s.print();
		System.out.println(s.ScalesFitness(weights));
		System.out.println("It took:" + counter + " times");
	}
}
