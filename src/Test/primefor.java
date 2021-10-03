package Test;

public class primefor {

	public static void main(String[] args) {
		boolean flag= false;    //set flag to false for
		int num= 28;            //input value
		int i=2;				// i value
		
		for(i=2;i<=num/2;i++)   // because we're using for we dont have to increment 
		{
			if(num %2==0) 
			{	flag= true;
				break;}
			
		}
		
		
		if(!flag)
			
				
				System.out.println(num+" is not Prime Number");
		

	}

}
