package methodreference;
public class InstanceMethodReference {
	
	public String seek(String msg)
	{
		System.out.println("Seek Method of "+msg);
		return msg;
	}
	
	public static void main(String[] args) {
		InstanceMethodReference imr= new InstanceMethodReference();
		//Show s=new InstanceMethodReference()::seek;
		Show s=imr::seek;
		s.display("Class InstanceMethodReference");
	}

}
