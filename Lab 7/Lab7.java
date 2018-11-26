import java.text.DecimalFormat;
import java.util.Random;

public class Lab7 {
	public static void main(String[] args) {
		double [] [] g={{0,1,2,3,3},{1,0,3,4,4},{2,3,0,4,1},{3,4,4,0,2},{3,4,1,2,0} };
		double startTime = System.currentTimeMillis();
		double [][] mst = MST.PrimsMST(g);
		double endtime = System.currentTimeMillis();
		double totalTime = endtime - startTime;
		System.out.println("total time taken = " + totalTime + " milliseconds");
		
	}
	
	//print the 2-D array
	static public void printArray(double [] [] mst) {
		DecimalFormat decimalFormat = new DecimalFormat();
		for (int i = 0; i < mst.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < mst.length; j++) {
				System.out.print( decimalFormat.format(mst[i][j]) + " ");
			}
			System.out.println("]");			
		}
	}
	
	//Generate random array of size n
	static double[][] randomArray(int n){
		Random random = new Random();
		double [][] randomArray = new double[n][n];
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray.length; j++) {
				randomArray[i][j]= random.nextInt(101);				
			}
		}		return randomArray;
	}

}
