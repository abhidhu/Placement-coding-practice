//16. Write a Java Program to find LCM of two given numbers. 


import java.util.Scanner;

public class D17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int i=1;
		while(true){
			if(a*i%b==0){
				System.out.println(a*i);
				break;
			}
			i++;
		}
		
	}
}