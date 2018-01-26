import java.util.*;
public class Pool {

	
	public ArrayList create_mating_pool(ArrayList a)
	{
		int[][] e= new int[10][10];
		int fitness=0;
		ArrayList mating_pool= new ArrayList();
		int sum=0;
		
		//System.out.println(a.size());
		Fitness f=new Fitness();
		
		for(int i=0;i<a.size();i++)
		{
			e=(int[][])a.get(i);
			fitness=f.calculate(e, 20,18,15,10, 40);
			sum=sum+fitness;
			//System.out.println(fitness);
			
			for(int j=0;j<fitness;j++)
			{
				mating_pool.add(e);
			}
		}
		System.out.println(sum);
		System.out.println(mating_pool.size());
		sum=0;
		return mating_pool;
	}
}
