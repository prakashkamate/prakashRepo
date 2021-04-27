package ConstructorMethodReference;


public class ConstructorMethodReference {
	
	public ConstructorMethodReference(String msg)
	{
		System.out.println(msg);
		
	}

	public static void main(String[] args) {
		
		Rebel r=ConstructorMethodReference::new;
		r.getRebel("Rebel ConstructorRefernce");
		// TODO Auto-generated method stub

	}

}
