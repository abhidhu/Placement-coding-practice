// 3. Find the second minimum number in the given array. 

public class P03{
	public static void main(String[] args){
		int[] arr={0,2,5,6,8,9,36,22,91,81};
		int avg=0;
		int first=Integer.MAX_VALUE;
		int secound=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(first>arr[i]){
				secound=first;
				first=arr[i];
			}else if(secound>arr[i] && first!=arr[i]){
				secound=arr[i];
			}
		}
		
		if(secound==Integer.MAX_VALUE){
			System.out.println("There is no secound smallest element in it");
		}else{
			System.out.println("Secound smallest element in array is: "+secound);
		}
		
	}
}