import java.util.*;

public class Sketch {


	
	public static void main(String[] args){
		
		
		int[][] element= new int[10][10];
		int[][] e= new int[10][10];
		double count=0;
		double radius_component;
		double rotor_radius=4;
		int v=2;
		double speed_local=0;
		int fitness;
		int sum=0;
		int iteration=0;
		boolean optimum=false;
		ArrayList mating_pool= new ArrayList();
		ArrayList generation= new ArrayList();
		
		double Ui=0;
		double k=0;
		ArrayList a=new ArrayList();
		
		
		Population p=new Population();
		a=p.generate();
		
		
		Pool mp= new Pool();
		mating_pool=mp.create_mating_pool(a);
		Fitness f= new Fitness();
		
		while(optimum!=true)
		{
			iteration++;
			
	    System.out.println("Generation " +iteration);	
		Reproduction r= new Reproduction();
		generation=r.crossover(mating_pool);
		Pool mn= new Pool();
		mating_pool= mn.create_mating_pool(generation);
		
		 for (int j=0;j<generation.size();j++)
		 {
			 e=(int[][])generation.get(j);
			 fitness=f.calculate(e, 20,18,15,10,40);
			 sum=sum+fitness;
		 }
		 if(sum>995)
			 optimum=true;
		 
		 sum=0;
		}
		
		
		e=(int[][])generation.get(1);
		

		
		
		
		
		
		
		/*for(int s=0;s<100;s++)
		{
			DNA d=new DNA();
			d.generateIndividual();
			element=d.getGene();
			a.add(element);	
		}*/
		
		
		
		
		
		
		//System.out.println(a.size());

        /*DNA d=new DNA();
        d.generateIndividual();
        e=(int[][])d.getGene(); */
        
        
		for(int i = 0; i<10; i++)
		{
		    for(int j = 0; j<10; j++)
		    {
		        System.out.print(e[i][j]);
		       
		    }
		    System.out.println();
		}
		
	    
		
		
		
	}
}

