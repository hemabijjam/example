package example;

public class practice {
	public boolean isValid(String s) {
		StringBuffer sb=new StringBuffer(s);
		   int i,j,k;
		   j=2;
		   for(k=0;k<s.length();k++) {
		   for(i=0;i<sb.length()-j+1;i++) {
			   if(sb.substring(i,i+1).equals("()") || sb.substring(i, i+1).equals("[]")|| sb.substring(i, i+1).equals("{}")){
				sb.delete(i, i+j-1);
				System.out.println(sb);
				}		   
		   }
		   }
		   if(sb.equals(null)) {
			   return true;
		   }
		   else
			   return false;
	}

	public static void main(String[] args) {
	String s="({})";
	practice p=new practice();
	boolean result=p.isValid(s);
	System.out.println(result);
	}
	}



