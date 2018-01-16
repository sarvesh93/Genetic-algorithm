import java.util.*;


public class Reproduction {
	
	
   
	 ArrayList generation= new ArrayList();
	 
	public ArrayList crossover(ArrayList mating_pool)
	{
		Random rand= new Random();
		int[][] a;
		int[][] b;
		int [][]child;
		int [][] mutated_child;
		int crossover_point=5;
		int count=0;
		int c=0,f=0;
		int child_count=0;
		int valid=0;
		  
	   
		while(generation.size()<100)
		{
			
		
	   a= (int[][])mating_pool.get(rand.nextInt(mating_pool.size()-1));
	   b= (int[][])mating_pool.get(rand.nextInt(mating_pool.size()-1));
	   
	   
	   DNA d= new DNA();
	   d.generateIndividual();
	   child=d.getGene();
	   
	   for(int i=0;i<10;i++)
	   {
		 
		   
		   for(int j=0;j<10;j++)
		   {
			     if(i<5)
			    	 child[i][j]=a[i][j];
			     else
			    	 child[i][j]=b[i][j]; 
		 	   //System.out.print(child[i][j]);
		 	   
			   if(child[i][j]==5)
				   child_count++;
		   }
		   //System.out.println();
	   }
	   count=0;
	   
	   //System.out.println(child_count);
	   if(child_count==30)
	   {
		   mutated_child = mutate(child);
		   generation.add(child);
	   }
	   
	   child_count=0;
	   
		}
		
		
        /* for(int k = 0; k<10; k++)
		{
		    for(int l = 0; l<10; l++)
		    {
		        System.out.print(a[k][l]);
		         if(a[k][l]==5)
		        	 c++;
		       
		    }
		    System.out.println();
		    
		}
	   
	   System.out.println(c);
	   c=0;
	   
	   for(int k = 0; k<10; k++)
		{
		    for(int l = 0; l<10; l++)
		    {
		        System.out.print(b[k][l]);
		        if(a[k][l]==5)
		        	 f++;
		    }
		    System.out.println();
		}
	   System.out.println(f);
	   f=0;
	   */
		
		return generation;
		
	}
	
	
	
	public int[][] mutate(int[][] element)
	{  
		Random rand= new Random();
		int count=0;
		int count_0=0;
		int bit=0;
		int set=0;
		int r=0;
		int s=0;
		int l=0;
		int m=0;
		
		float f=0;
		
		 for(int i=0;i<10;i++)
		   {
			 
			    for(int j=0;j<10;j++)
			   {
				   f=rand.nextFloat();
				   if(f<0.01)
				   {
					   if(element[i][j]==0)
					   {
						   element[i][j]=5;
						   bit=0;
						   
					   }
					   else
					   {
						   element[i][j]=0; 
						   bit=5;
						   
					   }
				   }
				   
				   if(element[i][j]==5)
					   count++;
				   
			   }
			    
			  }
		 
		 while(count!=30)
		 {
			if(count>30)
			{
			 r=rand.nextInt(10);
		     s=rand.nextInt(10);
		     
		     element[r][s]=0;
		     count--;
			}
			
			if(count<30)
			{
				 l=rand.nextInt(10);
			     m=rand.nextInt(10);
			     
			     element[l][m]=0;
			     count++;
			}
		     
			 
			 
			 
		 }
		 
		 return element;
	}

}


























