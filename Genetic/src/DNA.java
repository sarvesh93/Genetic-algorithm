import java.util.Random;
public class DNA {

	int[][] element = new int[10][10];
	
	
	public void generateIndividual() {
		Random rand = new Random();
		int c=0;
		int r=0;
		int s=0;
		for(int i=0; i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				element[i][j]=0;
			}
		}
		
		while(c<30)
		{
			r=rand.nextInt(10);
			s=rand.nextInt(10);
			
			if(element[r][s]==0)
			{
				element[r][s]=5;
				c++;
				
			}
		}
		
		
	}
	
	public int[][] getGene() {
        return element;
    }
}
