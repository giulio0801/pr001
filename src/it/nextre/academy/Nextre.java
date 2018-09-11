package it.nextre.academy;
public class Nextre extends Object{
	//membri della classe (variabili)
	String nome;
	static String code= "0x52";
	
	//costruttori
	public Nextre(){}
	public Nextre(String str){
		nome=str;
	}	
	
	//metodi
	public void printNome(){
		System.out.println("Nome: " + nome);
		System.out.println("Codice: " + code);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	final public static void main(String[] args){
		String nome= ""; 
		if (args.length>0){
			nome += args[0];
			System.out.println("Auguri "+nome+" !");
			}else{
				System.out.println("Necessario passare un parametro");
			}

		System.out.println("\n\n\n\n\n");


		Nextre n1 = new Nextre("Valerio");
		Nextre n2 = new Nextre("Mattia");
		
		n1.printNome();
		Nextre.code ="null";
		n2.printNome();
		n1.printNome();
		
	}
	
	
	
	public void test(){
		Nextre n1 = new Nextre();
	}

}




// final class Due{} // final rende la classe non estendibile.

class Due{}

class Tre extends Due {}