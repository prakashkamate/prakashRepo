package methodreference;
public class StaticMethodReference {
	
	
	public static String hide(String msg)
	{
		System.out.println("Hide Method of "+msg);
		return msg;
	}

	public static void main(String args[]) {
		
		
		
		Show s=StaticMethodReference::hide;
		
		s.display("Class");
		// TODO Auto-generated method stub

	}

}
