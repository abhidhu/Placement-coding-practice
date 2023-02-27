public class LeanearSearch{
	public static void main(String[] args){
		int[] arr={44,11,22,10,33,66,77,32,88};
		int target=33;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				System.out.println(i);
				break;
			}
		}
	}
}