/**
 * 
 * @author huangtt
 *
 */
public class MyStringTest {
	public static void main(String[] args) {
		try{
			String hold="";
			int length;
			MyString[] myst =new MyString[26];
			int i=0;
			
			System.out.println("****CHECK LENGTH FUNCTION****\n");
			for(char c='a'; c<='z'; c++) {
				hold+=c;
				myst[i]=new MyString(hold.toCharArray());
				System.out.print("String: "+myst[i].toString()+"\nlength: ");
				System.out.println(length=myst[i].length());
				if(length!=++i)
					throw new Exception("check length function");
			}
			
			System.out.println("\n****CHECK COMPARETO FUNCTION****\n");
			int b;
			for(i=0; i<26; i++) 
				for(int j=0; j<26; j++) {
					b=myst[i].compareTo(myst[j]);
					
					if(b<0) {
						System.out.println(myst[i]+" is smaller than "+myst[j]);
					}
					if(b>0) {
						System.out.println(myst[i]+" is greater than "+myst[j]);
					}
					if(b==0) {
						System.out.println(myst[i]+" is equal to "+myst[j]);
					}
				}
			
			System.out.println("\n****CHECK TOUPPERCASE AND TOLOWERCASE FUNCTION****\n");
			for(i=0; i<26; i++) {
				System.out.println("ToUpperCase: " +myst[i].toUpperCase()+" ToLowerCase: "+myst[i].toLowerCase());
			}
			
			System.out.println("\n****CHECK VALUEOF FUNCTION****\n");
			i=0;
			for(int j=-1000; j<=1000; j+=5) {
				System.out.println(MyString.valueOf(j));
			}
			
			
		}catch (Exception e) {System.out.println(e);}
	}
}
