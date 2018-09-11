package it.nextre.academy;

public class Punto3D extends Punto{
	private int z;	
	
	public Punto3D(){		
		super();
		z=0;
	}
	public Punto3D(int x, int y, int z){
		super(x,y);
		this.z=z;
		
	}	
	public int getZ(){return this.z;}
	public void setZ(int z){this.z=z;}
}