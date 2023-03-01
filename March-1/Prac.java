import java.util.Map.Entry;
import java.util.*;

class  Prac{
	public static void main(String[] args){
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(1,"Abhi");
		map.put(2,"dhumal");
		map.put(3,"Ram");
		map.put(4,"Sham");
		
		for(Entry s: map.entrySet()){
			System.out.println(s.getKey()+" "+s.getValue());
			if(s.getKey()==1){
				s.setValue="Guru";
			}
		}
		
		
		for(Entry s: map.entrySet()){
			System.out.println(s.getKey()+" "+s.getValue());
			
		}
		
		
	}
}