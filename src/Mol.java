public class Mol {
 public static void main(String[] args) {
	
	 A a=new B();
	 B b=new B();
	 
	 b.m1(10);
 }

}
class A{
	
	public void m1(int a){
		
		System.out.println("m1 in A");
	}
	public void m2(){
		System.out.println("m2 in A");
	}
}
class B extends A{
	public void m1(){
		System.out.println("m1 in B");
	}
	public void m2(){
		System.out.println("m2 in B");
	}
	public void m3(){
		System.out.println("m3 in B");
	}
}