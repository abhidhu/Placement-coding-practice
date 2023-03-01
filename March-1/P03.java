import java.util.*;

public class P03{
	
	
	static int GCD(int n1,int n2){
		if(n1==n2)		return n1;
		
		if(n1>n2){
			int diff=n1-n2;
			return GCD(diff,n2);
		}else{
			int diff=n2-n1;
			return GCD(diff,n1);
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(GCD(n1,n2));
	}
}