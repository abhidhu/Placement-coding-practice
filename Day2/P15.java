//  Write a program to find the Most Frequent Element using HashTable. 
import java.util.*;
import java.util.Map.Entry;

public class P15{
	public static void main(String[] args){
		int arr[] = {1, 3, 2,2, 1, 4, 1};
		/* time complexity n ^ 2
		int maxCountElement=arr[0];
		int maxCount=0;
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j])	count++;
			}
			if(maxCount<count){
				maxCountElement=arr[i];
				maxCount=count;
			}
		}
		System.out.println(maxCountElement);
		*/
		
		
		// Method Secound Sort the array time complexity nlog(n)
		
		/*
		Arrays.sort(arr);
		
		int maxcount=0;
		int count=1;
		int maxElemtnt=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]){
				count++;
			}else{
				if(maxcount<count){
					maxcount=count;
					maxElemtnt=arr[i-1];
				}
				count=1;
			}
		}
		System.out.println(maxcount+" "+maxElemtnt);
		*/
		
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++){
			int key=arr[i];
			if(hm.containsKey(key)){
				int freq=hm.get(key);
				hm.put(key,++freq);
			}else{
				hm.put(key,1);
			}
		}
		
		int max_count = 0, res = -1;
          
        for(Entry<Integer, Integer> val : hm.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

			System.out.println(res);
	}
}