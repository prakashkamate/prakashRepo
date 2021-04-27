import methodreference.Show;

public class Hide {

	public static void main(String[] args) {
		
		Show s=(msg)->{
			
			return msg;
		};
		
		String s1=s.display("===========ALL is Well=======");
		System.out.println(s1);
		// TODO Auto-generated method stub

	}

}
