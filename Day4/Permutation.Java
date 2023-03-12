class Per{
	
	static void per(String str, String ans){
		if(str.length==0){
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			String left=str.substring(0,i);
			String right=str.substring(i+1);
			str=left+right;
			ans+=ch;
			per(str,ans);
		}
	}
	
	
	public static void main(String[] args){
		String str="ABC";
		per(str,"");
	}
}