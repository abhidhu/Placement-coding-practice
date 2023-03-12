class Per{
	
	static void per(String str, String ans){
		if(str.length()==0){
			System.out.print(ans+" ");
			return;
		}
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			String left=str.substring(0,i);
			String right=str.substring(i+1);
			String res=left+right;
			ans=ans;
			per(res,ans+ch);
		}
	}
	
	
	public static void main(String[] args){
		String str="ABC";
		per(str,"");
	}
}