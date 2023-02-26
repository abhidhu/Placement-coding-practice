// 8. Write a Java Program to find the Union of Two Arrays (Sorted Arrays).




public class P08{
	public static void main(String[] args){
		 int a[] = {1, 2, 3, 4, 5, 6};
		 int b[] = {3, 4, 5, 6, 7,9,10,13,15,65};
		 int[] ans=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				ans[k++]=a[i++];
			}else{
				ans[k++]=b[j++];
			}
		}
		
		while(i<a.length){
			ans[k++]=a[i++];
		}
		while(j<b.length){
			ans[k++]=b[j++];
		}
		
		for(int i1: ans){
			System.out.print(i1+" ");
		}
	}
}