//Store an edge, from node i to j with weigh w
public class Edge extends Object
{
	public int nodeI,nodeJ;
	public double weight;
	Edge(int ii,int jj,double ww)
	{
		nodeI = ii;
		nodeJ = jj;
		weight = ww;
	};
	public void Print()
	{
		System.out.print("(");
		System.out.print(nodeI);
		System.out.print(",");
		System.out.print(nodeJ);
		System.out.print(",");
		System.out.print(weight);
		System.out.print(")");
	}
};