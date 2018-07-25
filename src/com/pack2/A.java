package com.pack2;
//import com.pack1.*;
//import static com.pack1.Fish.STAR;


public class A {

	public static void main(String[] args) {
		//System.out.println(STAR);
 Color[] c=Color.values();
 for(Color cl:c){
	 cl.info();
 }
		
		
	}

}
enum Color{ 
BLUE,
RED,
GREEN{

	//@SuppressWarnings("unused")
	public void info(){
		System.out.println("uni color");
		
	}
	
},WHITE;
	public void info(){
		
	   System.out.println("dan color");	
		
		
		
	}
}
 




