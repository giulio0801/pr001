package it.nextre.academy;

public class Numeri{
	
	
	public static void main(String[] args){
	//numeri();
	caratteri();
	}
	
	private static void caratteri(){
		
		char a = 'A';
		char b = 'B';
		char ab = (char)(a+b);
		System.out.println( (char)(a+b));
		System.out.println( '\u0131');
		
		for (char x = 'a';x<='z';x++){
			//System.out.println(x);
		}
		
	}
	
	private static void numeri(){
		byte b3 = 127; // -128 -127
	//b3 = b3*2;
	byte b4 = (byte)(b3+2);
	System.out.println(b4);
	b3++; //b3 = (byte)(b3 +1)
	System.out.println(b3);
	
	long l1 = 2_147_483_648L;
	System.out.println(l1);
	}
}