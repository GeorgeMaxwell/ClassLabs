import java.util.ArrayList;

public class Lab8 {
	public static void main(String[] args) {
		ArrayList<Double> weights = new ArrayList<>();
		ScalesSolution s = new ScalesSolution("00001");
		weights.add(1.0);
		weights.add(2.0);
		weights.add(3.0);
		weights.add(4.0);
		weights.add(10.0);
		s.println();
		//s.print();
		System.out.println(s.ScalesFitness(weights));

		


	}
}
