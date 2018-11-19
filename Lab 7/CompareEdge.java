//Compare edge weights - used to sort an ArrayList of edges
public class CompareEdge implements java.util.Comparator 
{
	public int compare(Object a, Object b) 
	{
		if (((Edge)a).weight < ((Edge)b).weight) return(-1);
		if (((Edge)a).weight > ((Edge)b).weight) return(1);
		return(0);
	}
}
