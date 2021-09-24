package Test;

public class Primenum {

	public static void main(String[] args) {
		int num= 25;
		int i =2;
		boolean f=false;
		
		while (i<=num / 2) {
			if(num%2==0) {
				f=true;
				break;}
			i++;
		}
		if(!f)
			System.out.println(num+": the number is prime");
		else
			System.out.println(num+": is the number is not prime");
	}
}
