package example;


	public class ParentesisValidation {
	public boolean isValid(String s) {
		StringBuffer sb=new StringBuffer(s);
		   int i,j,k;
		   for(k=0;k<sb.length();k++) {
		   if(sb!=null) {
		   for(i=0;i<sb.length()/2;i++) {
			   for(j=i+1;j<sb.length()-1;j++) {
			   if(sb.substring(i,j).equals("()") || sb.substring(i, j).equals("[]")|| sb.substring(i, j).equals("{}")){
				sb.delete(i, j);
				System.out.println(sb);
				}
		   }
		   }
		   }}
		   if(sb.isEmpty()) {
			   return true;
		   }
		   else
			   return false;
	}

	public static void main(String[] args) {
	String s="[()]}";
	ParentesisValidation pv=new ParentesisValidation();
	boolean result=pv.isValid(s);
	System.out.println(result);
	}
	}

