import java.util.*;

public class MST
{
	//Search for the next applicable edge
	static private Edge LocateEdge(ArrayList<Integer> v,ArrayList<Edge> edgesList)
	{
		for (Iterator<Edge> iterator = edgesList.iterator(); iterator.hasNext();)
		{
	        Edge e = iterator.next();
	        int x = e.nodeI;
	        int y = e.nodeJ;
			int xv = v.indexOf(x);
			int yv = v.indexOf(y);
			if (xv > -1 && yv == -1)
			{
				return(e);
			}
			if (xv == -1 && yv > -1)
			{
				return(e);
			}
		}
		//Error condition
		return(new Edge(-1,-1,0.0));
	}
	@SuppressWarnings("unchecked")
	//d is a distance matrix, high value edges are more costly
	//Assume that d is symmetric and square
	public static double[][] PrimsMST(double[][] d)
	{
		int i,j,n = d.length;
		double res[][] = new double[n][n];
		//Store edges as an ArrayList
		ArrayList<Edge> edgesList = new ArrayList<Edge>();
		for(i=0;i<n-1;++i)
		{
			for(j=i+1;j<n;++j)
			{
				//Only non zero edges
				if (d[i][j] != 0.0) edgesList.add(new Edge(i,j,d[i][j]));
			}
		}
		//Sort the edges by weight
		Collections.sort(edgesList,new CompareEdge());
		//Don't do anything more if all the edges are zero
		if (edgesList.size() == 0) return(res);
		//List of variables that have been allocated
		ArrayList<Integer> variablesList = new ArrayList<Integer>();
		//Pick cheapest edge
		variablesList.add(edgesList.get(0).nodeI);
		//Loop while there are still nodes to connect
		while(variablesList.size() != n)
		{
			Edge e = LocateEdge(variablesList,edgesList);
			if (variablesList.indexOf(e.nodeI) == -1) variablesList.add(e.nodeI);
			if (variablesList.indexOf(e.nodeJ) == -1) variablesList.add(e.nodeJ);
			res[e.nodeI][e.nodeJ] = e.weight;
			res[e.nodeJ][e.nodeI] = e.weight;
		}
		return(res);
	}
}