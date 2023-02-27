public class BubbleSort{
	public static void main(String[] args){
		int[] arr={44,11,22,10,33,66,77,88};
		//int[] arr={5,3,1,9,8,2,4,7};
		
		/*for(int i=0;i<arr.length;i++){
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					flag=false;
				}
			}
			for(int i1: arr){
			System.out.print(i1+" ");
			}System.out.println();
			if(flag)	break;
		}
		
		System.out.println();
		for(int i: arr){
			System.out.print(i+" ");
		}*/
		/*
		for(int i=0;i<arr.length;i++){
			boolean flag=true;
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag){
				System.out.println(i);
				break;
			}
		}
		for(int i: arr){
			System.out.print(i+" ");
		}
		*/
		
		
		for(int i=0;i<arr.length;i++){
			boolean flag=true;
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag)	break;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}