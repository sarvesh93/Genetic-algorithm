import java.util.*;

public class Population {

	
	public ArrayList generate()
	{
		ArrayList a=new ArrayList();
		int[][] element= new int[10][10];
		int[][] e= new int[10][10];
		
		for(int s=0;s<100;s++)
		{
			DNA d=new DNA();
			d.generateIndividual();
			element=d.getGene();
			a.add(element);	
		}
		return a;
	}
	
	
}
