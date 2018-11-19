import java.util.ArrayList;
import java.util.Random;

public class Lab6 {
	public static void main(String[] args) {
		
		sort('B', 100000);
		sort('C', 100000);
		sort('A', 100000);
	
	}
	public static ArrayList<Integer> RandomArray(int n) {
		ArrayList<Integer> randomList = new ArrayList<Integer>(n);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		

		for(int i =0; i<n; i++) {
			
			Integer randomNumer = Math.abs(rand.nextInt() % 256);
			randomList.add(randomNumer);
		}
		return randomList;
	}
	public static void ShowArray(ArrayList<Integer> randomList) {
		System.out.print(randomList);
	}
	public static void sort(char sortLetter, int n) {
		double startTime = System.currentTimeMillis();
		if (sortLetter == 'A') {
			ThreeSorts.SortA(RandomArray(n));			
		}else if (sortLetter == 'B') {
			ThreeSorts.SortB(RandomArray(n));
		}else if (sortLetter == 'C') {
			ThreeSorts.SortC(RandomArray(n));
		}		
		double endTime = System.currentTimeMillis();
		double timeTaken = endTime -startTime;
		System.out.println("time taken using sort"+ sortLetter + ": " + timeTaken);
		
	}
	
}
