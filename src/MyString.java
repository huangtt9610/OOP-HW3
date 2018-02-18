import java.util.Arrays;
/**
 * 
 * @author huangtt
 *
 */
public class MyString {
	public MyString(char[] chars) {
		int size=chars.length;
		c=new char[size];
		
		while(size-->0) {			
			c[size]=chars[size];
		}		
	}
	
	public char charAt(int index) {
		return c[index];
	}
	
	public int length() {
		return c.length;
	}
	
	public MyString substring(int begin, int end) {
		char[] newC;
		newC=Arrays.copyOfRange(c, begin, end);
		MyString mystr=new MyString(newC);
		return mystr;
		
	}
	
	public MyString toLowerCase() {
		int i=c.length;
		char[] c1=new char[i];
		
		while(i-->0) {
			c1[i]= Character.toLowerCase(c[i]);
		}
		
		MyString str=new MyString(c1);
		return str;
	}
	
	public MyString toUpperCase() {
		int i=c.length;
		char[] c1=new char[i];
		
		while(i-->0) {
			c1[i]= Character.toUpperCase(c[i]);
		}
		
		MyString str=new MyString(c1);
		return str;
	}
	
	public int compareTo(MyString s) {
		int i=0;		
		while(i< c.length && i < s.c.length) {
			if(c[i]!=s.c[i]) {
				return c[i]-s.c[i];
			}
			i++;
		}
		
		i=c.length-s.c.length;
		return i;
		
	}
	
	public MyString getMyString() {
		MyString mystr=new MyString(c);
		return mystr;
	}
	
	public String toString() {
		return new String(c);
	}
	
	public static MyString valueOf(int i) {
		char[] temp=new char[11];	
		int j=0;	
		if(i==0) {
			temp[0]=(char)('0');
			j++;
		}
		
		boolean isNegative=false;
		if(i<0) {
			temp[j++]=(char)(Math.abs(i%10)+'0');		
			i=Math.abs(i/=10);		
			isNegative=true;
		}
		
		while(i>0) {
			temp[j]=(char)(i%10+'0');  //learn this from https://stackoverflow.com/questions/3389264/how-to-get-the-separate-digits-of-an-int-number
			i/=10; 
			j++;	
		}
		
		if(isNegative) 
			temp[j++]='-';

		int n=0;
		char[] c1=new char[j];
	
		while(j-->0) {
			c1[n++]=temp[j];		
		}	
		
		MyString myst=new MyString(c1);
		return myst;	
	}
	
	private char c[];
	
	public static void main(String[] args) {
		char[] a= {'a','b','c'};
		char[] b= {'a','b','c','d'};
		MyString ms=new MyString(a);
		MyString ms1=new MyString(b);
		System.out.println(ms.compareTo(ms1));
		
		

	}
}