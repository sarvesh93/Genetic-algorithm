import java.util.*;
public class Fitness {

	
	public int calculate(int [][] element, int speed,int s2, int s3, int s4, double rotor_radius){
		
		int count=0;
		int Ut=0;
		double Ui=0;
		double speed_local=0;
		double radius_component;
		double r,s,sum=0;
		boolean value=false;
		int v=0;
		double r1=0;
		double[] a;
		double grand_total=0;
		int fitness=0;
		int fitness2=0;
		int fitness3=0;
		int fitness4=0;
		int fitness_final=0;
		
		
		ArrayList speeds=new ArrayList();
		Vector global=new Vector();
		
		for(int i=0;i<10;i++)
		{
			
			speeds.clear();
			
			for(int l = 0; l< global.size(); l++)
			    grand_total =grand_total+ (double)global.get(l);
			
			global.clear();
			value=false;
			count=0;
			
			for(int j=0;j<10;j++){
				
				
				if(element[i][j]==5)
				{
					
					
				if(j==0||value==false)
				{
					
						
				  	speed_local=speed;
				  	value=true;
				  	
				  	global.add(speed_local);
				  	//System.out.println(speed_local);
				  	
				  	count=1;
				  	v=j;
				  	continue;
				  	
				}
				if(count==1)
				{
					
					r1=rotor_radius+0.1*((j-v)*10*rotor_radius);
					
					radius_component= (double)(rotor_radius/r1);
					
				    speed_local= speed*(1-(0.75*Math.pow(radius_component, 2)));
				   
				    global.add(speed_local);
				  // System.out.println(speed_local);
				   
				    count++;
				    continue;
				    
				}
				else if(count>1)
				{
					//System.out.println("row no " + i);
					//System.out.println(global.size());
					//System.out.println("in");
					//System.out.println(j);
					
					
				  for(int k=0;k<global.size();k++)
				  {
					  Ui=(double)global.get(k);
					  //System.out.println(Ui);
					  r=(1-(double)(Ui/speed));
					  s=Math.pow(r, 2);
					  sum=sum+s;
					  
				  }
					
				  speed_local=speed*(1-Math.sqrt(sum));
				 
				  global.add(speed_local);
				  sum=0;
				  //System.out.println(speed_local);
				  
				}
				
			  }
				
			}
		}
		
		
		if(grand_total<200)
			fitness=0;
		if(grand_total>220&&grand_total<240)
		    fitness=1;
		if(grand_total>240&&grand_total<260)
			fitness=2;
		if(grand_total>260&&grand_total<280)
			fitness=3;
		if(grand_total>280&&grand_total<300)
			fitness=4;
		if(grand_total>300&&grand_total<320)
			fitness=5;
		if(grand_total>320&&grand_total<340)
			fitness=6;
		if(grand_total>340&&grand_total<360)
			fitness=7;
		if(grand_total>360&&grand_total<380)
			fitness=8;
		if(grand_total>380&&grand_total<400)
			fitness=9;
		if(grand_total>400&&grand_total<420)
			fitness=10;
		if(grand_total>420&&grand_total<440)
			fitness=11;
		if(grand_total>440&&grand_total<460)
			fitness=12;
		if(grand_total>460&&grand_total<480)
			fitness=13;
		if(grand_total>480&&grand_total<500)
			fitness=14;
		if(grand_total>500)
			fitness=15;
		//System.out.println(grand_total);
		//System.out.println(fitness);
		
		Fitness_south f2= new Fitness_south();
		fitness2=f2.calculate(element, s2, 40);
		
		Fitness_east f3= new Fitness_east();
		fitness3=f3.calculate(element, s3, 40);
		
		Fitness_north f4= new Fitness_north();
		fitness4=f4.calculate(element, s4, 40);
		
		fitness_final= (fitness+fitness2+fitness3+fitness4)/4;
		
		return fitness_final;
	}
}
