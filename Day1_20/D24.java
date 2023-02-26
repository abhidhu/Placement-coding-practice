// Write a Java Program to print Armstrong Numbersbetween 1 to 1000.

public class D24{
	
	static boolean isAmstromg(int n){
		int temp=n;
		int ans=0;
		while(temp>0){
			int c=temp%10;
			ans+=c*c*c;
			temp/=10;
		}
		if(ans==n)	return true;
		return false;
	}
	public static void main(String[] args){
		for(int i=1;i<=1000;i++){
			if(isAmstromg(i))	System.out.print(i+" ");
		}
	}
}