// Write a Java Program to print Perfect Numbersbetween 1 to 1000.


public class D26{
	static boolean isPerfect(int n){
		int ans=1;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)	ans+=i+(n/i);
		}
		
		if(ans==n)	return true;
		else return false;
	}
	public static void main(String[] args){
		
		for(int i=2;i<=1000;i++){
			if(isPerfect(i))	System.out.print(i+" ");
		}
		
		
	}
}