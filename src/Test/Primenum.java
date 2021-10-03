package Test;

public class Primenum {

	public static void main(String[] args) {
		int numb= 25;
		int i =2;
		boolean f=false;
		
		while (i<=numb / 2) {
			if(numb%2==0) {
				f=true;
				break;
				//need break 
			}
			i++;
		}
		
		if(!f)
			System.out.println(numb+": the is number is prime");
		else
			System.out.println(numb+": is the number is not prime");
	}
}
