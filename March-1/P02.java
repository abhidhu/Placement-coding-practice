//2. Write a Java program to find the k largest elements in a given array. Elements in the array 
//can be in any order (Use scanner class to input and Array, below picture is example do not 
//make static array as repsrented in example). [1 Mark]
import java.util.Arrays;
public class P02{
	public static void main(String[] args){
		int[] arr={1,4,17,7,25,3,100};
		Arrays.sort(arr);
		int k=3;
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1])		continue;
				
				
			if(--k==1){
				System.out.print(arr[i]);
				break;
			}
		}
		
		
	}
}